import React from 'react';
import {Link} from 'react-router';
import TextField from './TextField';

export default class FormStep1 extends React.Component {
  constructor(props, context) {
    super(props, context);
    this.state = {
      realName: '',
      artistName: '',
      email: '',
      birthday: '',
    };
  }

  onFieldChange(field, event) {
    event.preventDefault();
    this.setState({[field]: event.target.value});
  }

  render() {
    const state = this.state;
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
                  <TextField id="real-name" type="text" label="Your Real Name" value={state.realName}
                             onChange={this.onFieldChange.bind(this, 'realName')}/>
                </div>
              </div>
              <div className="row align-items-center">
                <div className="col mt-4">
                  <TextField id="artist-name" type="text" label="Your Artist Name" value={state.artistName}
                             onChange={this.onFieldChange.bind(this, 'artistName')}/>
                </div>
              </div>
              <div className="row align-items-center mt-4">
                <div className="col">
                  <TextField id="email" type="email" label="Your Email" value={state.email}
                             onChange={this.onFieldChange.bind(this, 'email')}/>
                </div>
              </div>
              <div className="row align-items-center mt-4">
                <div className="col">
                  <TextField id="birthday" type="date" label="Your Birthday" value={state.birthday}
                             onChange={this.onFieldChange.bind(this, 'birthday')}/>
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
                    <Link to="/step-two" className="btn mt-4">Next</Link>
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
