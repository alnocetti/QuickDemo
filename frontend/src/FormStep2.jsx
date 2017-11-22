import React from 'react';
import {Link} from 'react-router';
import ReactFilestack from 'filestack-react';
import TextField from './TextField';
import dataStore from './dataStore';
import store from './store';

export default class FormStep2 extends React.Component {
  static fileStackApiKey = 'AYhVpjHxIRRKXmnawND6nz';
  static fileStackOptions = {
    fromSources: ['local_file_system', 'url', 'googledrive', 'dropbox'],
    accept: ['audio/*']
  };

  state = {
    demo: store.getDemo()
  };

  onFieldChange(field, event) {
    event.preventDefault();
    const {demo} = this.state;
    demo[field] = event.target.value;
    this.setState({demo});
  }

  onNextClick(event) {
    event.preventDefault();
    // TODO: validate
    store.setDemo(this.state.demo);
    this.props.router.push('/step-three');
  }

  onUploadSuccess(result) {
    if (result.filesUploaded && result.filesUploaded.length !== 1) {
      // TODO: show error saying that we support only one file
      return;
    }

    const fileId = result.filesUploaded[0].handle;
    this.setState({fileId});
  }

  onUploadError() {
    // TODO: display that there was an error uploading the file
  }

  render() {
    const {demo} = this.state;
    return (
      <section className="fdb-block">
        <div className="container">
          <div className="row justify-content-center">
            <div className="col-12 col-md-8 col-lg-8 col-xl-6">
              <div className="row">
                <div className="col text-center">
                  <h1>Demo</h1>
                  <p className="text-h3">Upload your demo and give us info about it.</p>
                </div>
              </div>
              <ReactFilestack
                apikey={FormStep2.fileStackApiKey}
                options={FormStep2.fileStackOptions}
                onSuccess={this.onUploadSuccess.bind(this)}
                onError={this.onUploadError.bind(this)}
                render={({onPick}) => (
                  <div className="row align-items-center">
                    <div className="col mt-4">
                      <div className="d-flex justify-content-center">
                        <button className="btn btn-block" onClick={onPick}>Choose a file</button>
                      </div>
                    </div>
                  </div>
                )}
              />
              <div className="row align-items-center">
                <div className="col mt-4">
                  <TextField id="track-name" type="text" label="Track Name (e.g. The Final Countdown)"
                             value={demo.name} onChange={this.onFieldChange.bind(this, 'name')}/>
                </div>
              </div>
              <div className="row align-items-center mt-4">
                <div className="col">
                  <select className="form-control" name="track-genre" id="track-genre" value={demo.genreId}
                          onChange={this.onFieldChange.bind(this, 'genreId')}>
                    <option value="0">- Genre -</option>
                    {
                      dataStore.genres.map(g => <option key={g.genreId} value={g.genreId}>{g.name}</option>)
                    }
                  </select>
                </div>
                <div className="col">
                  <TextField id="year" type="text" label="Year of Production (e.g. 2017)"
                             value={demo.year} onChange={this.onFieldChange.bind(this, 'year')}/>
                </div>
              </div>
              <div className="row align-items-center mt-4">
                <div className="col">
                  <div className="d-flex justify-content-start">
                    <Link to="/step-one" className="btn-link mt-4">Previous</Link>
                  </div>
                </div>
                <div className="col">
                  <div className="d-flex justify-content-end">
                    <button className="btn mt-4" onClick={this.onNextClick.bind(this)}>Next</button>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>
    );
  }
}
