import React from 'react';
import validations from './validations';
import TextField from './TextField';
import store from './store';

export default class FormStep1 extends React.Component {
  static rules = {
    realName: [validations.notEmpty],
    artistName: [validations.notEmpty],
    email: [validations.isEmail],
    birthday: [validations.isDate],
  };

  state = {
    artist: store.getArtist(),
    errors: {},
  };

  onFieldChange(field, event) {
    event.preventDefault();
    const {artist, errors} = this.state;
    artist[field] = event.target.value;
    errors[field] = false;
    this.setState({artist, errors});
  }

  onNextClick(event) {
    event.preventDefault();

    if (this.validate(this.state.artist)) {
      return;
    }

    store.setArtist(this.state.artist);
    this.props.router.push('/step-two');
  }

  validate(obj) {
    const errors = validations.validate(obj, FormStep1.rules);
    this.setState({errors});
    return Object.keys(errors).length > 0;
  }

  render() {
    const {artist, errors} = this.state;
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
                  <TextField id="real-name" type="text" label="Your Real Name" value={artist.realName}
                             onChange={this.onFieldChange.bind(this, 'realName')} hasError={errors['realName']}/>
                </div>
              </div>
              <div className="row align-items-center">
                <div className="col mt-4">
                  <TextField id="artist-name" type="text" label="Your Artist Name" value={artist.artistName}
                             onChange={this.onFieldChange.bind(this, 'artistName')} hasError={errors['artistName']}/>
                </div>
              </div>
              <div className="row align-items-center mt-4">
                <div className="col">
                  <TextField id="email" type="text" label="Your Email" value={artist.email}
                             onChange={this.onFieldChange.bind(this, 'email')} hasError={errors['email']}/>
                </div>
              </div>
              <div className="row align-items-center mt-4">
                <div className="col">
                  <TextField id="birthday" type="date" label="Your Birthday" value={artist.birthday}
                             onChange={this.onFieldChange.bind(this, 'birthday')} hasError={errors['birthday']}/>
                </div>
              </div>
              <div className="row text-center justify-content-center mt-4 mb-0">
                <p className="text">We promise we'll keep your music safe.</p>
              </div>
              <div className="row justify-content-start mt-0">
                <div className="col">
                  <div className="d-flex justify-content-end">
                    <button className="btn" onClick={this.onNextClick.bind(this)}>Next</button>
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
