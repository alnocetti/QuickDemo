import React from 'react';
import {Link} from 'react-router';
import TextField from './TextField';

export default class FormStep1 extends React.Component {
  render() {
    return (
      <section className="fdb-block">
        <div className="container">
          <div className="row justify-content-center">
            <div className="col-12 col-md-8 col-lg-8 col-xl-6">
              <div className="row">
                <div className="col text-center">
                  <h1>Get started</h1>
                  <p className="text-h3">We need some of your personal information.</p>
                </div>
              </div>
              <div className="row align-items-center">
                <div className="col mt-4">
                  <TextField id="real-name" type="text" label="Your Real Name"/>
                </div>
              </div>
              <div className="row align-items-center">
                <div className="col mt-4">
                  <TextField id="artist-name" type="text" label="Your Artist Name"/>
                </div>
              </div>
              <div className="row align-items-center mt-4">
                <div className="col">
                  <TextField id="email" type="email" label="Your Email"/>
                </div>
              </div>
              <div className="row align-items-center mt-4">
                <div className="col">
                  <TextField id="birthday" type="date" label="Your Birthday"/>
                </div>
              </div>
              <div className="row justify-content-start mt-4">
                <div className="col">
                  <div className="form-check">
                    <label className="form-check-label">
                      <input type="checkbox" className="form-check-input"/>
                      I Read and Accept <Link to="/terms-and-conditions">Terms and Conditions</Link>
                    </label>
                  </div>
                  <div className="d-flex justify-content-end">
                    <button className="btn mt-4">Next</button>
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
