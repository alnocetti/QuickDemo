import React from 'react';
import {Link} from 'react-router';
import ReactFilestack from 'filestack-react';
import TextField from './TextField';

export default class FormStep2 extends React.Component {
  static fileStackApiKey = 'AYhVpjHxIRRKXmnawND6nz';
  static fileStackOptions = {
    fromSources: ['local_file_system', 'url', 'googledrive', 'dropbox'],
    accept: ['audio/*']
  };

  onUploadSuccess(result) {
    console.log(result.filesUploaded);
    // TODO: display that the file was successfully uploaded
  }

  onUploadError() {
    // TODO: display that there was an error uploading the file
  }

  render() {
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
                  <TextField id="track-name" type="text" label="Track Name (e.g. The Final Countdown)"/>
                </div>
              </div>
              <div className="row align-items-center mt-4">
                <div className="col">
                  <TextField id="track-genre" type="text" label="Track Genre (e.g. Tech House)"/>
                </div>
                <div className="col">
                  <TextField id="year" type="text" label="Year of Production (e.g. 2017)"/>
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
                    <Link to="/step-three" className="btn mt-4">Next</Link>
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
