import React from 'react';
import {Link} from 'react-router';
import ReactFilestack from 'filestack-react';
import validations from './validations';
import TextField from './TextField';
import dataStore from './dataStore';
import store from './store';

export default class FormStep2 extends React.Component {
  static fileStackApiKey = 'AYhVpjHxIRRKXmnawND6nz';
  static fileStackOptions = {
    fromSources: ['local_file_system', 'url', 'googledrive', 'dropbox'],
    accept: ['audio/*']
  };

  static rules = {
    fileId: [validations.notEmpty],
    name: [validations.notEmpty],
    genreId: [validations.isNot(0)],
    year: [validations.isYear],
  };

  state = {
    demo: store.getDemo(),
    errors: {},
  };

  onFieldChange(field, event) {
    event.preventDefault();
    const {demo, errors} = this.state;
    demo[field] = event.target.value;
    errors[field] = false;
    this.setState({demo, errors});
  }

  onNextClick(event) {
    event.preventDefault();

    if (this.validate(this.state.demo)) {
      return;
    }

    store.setDemo(this.state.demo);
    this.props.router.push('/step-three');
  }

  validate(obj) {
    const errors = validations.validate(obj, FormStep2.rules);
    this.setState({errors});
    return Object.keys(errors).length > 0;
  }

  onUploadSuccess(result) {
    const {demo, errors} = this.state;

    if (result.filesUploaded && result.filesUploaded.length !== 1) {
      errors.fileId = true;
      return;
    }

    demo.fileId = result.filesUploaded[0].handle;
    errors.fileId = false;
    this.setState({demo, errors});
  }

  onUploadError() {
    const {errors} = this.state;
    errors.fileId = true;
    this.setState({errors});
  }

  render() {
    const {demo, errors} = this.state;
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
                        <button className="btn btn-block"
                                style={errors['fileId'] ? {backgroundColor: '#de4d4f', borderColor: '#de4d4f'} : {}}
                                onClick={onPick}>{demo.fileId ? 'File uploaded 👌' : 'Choose a file'}
                        </button>
                      </div>
                    </div>
                  </div>
                )}
              />
              <div className="row align-items-center">
                <div className="col mt-4">
                  <TextField id="track-name" type="text" label="Track Name (e.g. The Final Countdown)"
                             value={demo.name} onChange={this.onFieldChange.bind(this, 'name')}
                             hasError={errors['name']}/>
                </div>
              </div>
              <div className="row align-items-center mt-4">
                <div className="col">
                  <select className="form-control" name="track-genre"
                          style={errors['genreId'] ? {borderColor: '#de4d4f'} : {}} value={demo.genreId}
                          onChange={this.onFieldChange.bind(this, 'genreId')}>
                    <option value="0">- Genre -</option>
                    {
                      dataStore.genres.map(g => <option key={g.genreId} value={g.genreId}>{g.name}</option>)
                    }
                  </select>
                </div>
                <div className="col">
                  <TextField id="year" type="text" label="Year of Production (e.g. 2017)"
                             value={demo.year} onChange={this.onFieldChange.bind(this, 'year')}
                             hasError={errors['year']}/>
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
