import React from 'react';
import PropTypes from 'prop-types';
import _ from 'underscore';
import api from './api';
import auth from './auth';

class Login extends React.Component {
  constructor(props, context) {
    super(props, context);
    this.state = {
      loggingIn: false,
      errors: {}
    };
  }

  onSubmit(event) {
    event.preventDefault();
    const errors = {};

    this.setState({errors});

    const email = event.target.email.value;
    const password = event.target.password.value;

    if (!email) {
      errors.email = 'Email required';
    }

    if (!password) {
      errors.password = 'Password required';
    }


    if (!_.isEmpty(errors)) {
      this.setState({errors});
      return;
    }

    api.post('auth', {email, password}, (err, result) => {
      if (err) {
        this.setState({
          errors: {
            server: 'Invalid email and/or password'
          }
        });
        return;
      }

      auth.setToken(result.data.token);
      this.props.router.push('/');
    });
  }

  render() {
    const loggingIn = this.state.loggingIn ? <div className="overlay"><i className="fa fa-refresh fa-spin"/></div> :
      <span/>;

    return (
      <section className="content">
        <div className="row">
          <div className="col-md-6 col-md-offset-3">
            <div className="box box-info">
              <div className="box-header with-border">
                <h3 className="box-title">Tonight - Sign in</h3>
              </div>
              <form className="form-horizontal" onSubmit={this.onSubmit.bind(this)}>
                <AuthErrors errors={this.state.errors}/>
                <div className="box-body">
                  <AuthFormInput
                    hasError={!!this.state.errors.email}
                    label="Email"
                    name="email"
                    type="email"
                  />
                  <AuthFormInput
                    hasError={!!this.state.errors.password}
                    label="Password"
                    name="password"
                    type="password"
                  />
                </div>
                <div className="box-footer">
                  <button type="reset" className="btn btn-default">Cancel</button>
                  <button type="submit" className="btn btn-info pull-right">Sign in</button>
                </div>
              </form>
              {loggingIn}
            </div>
          </div>
        </div>
      </section>
    );
  }
}

class AuthFormInput extends React.Component {
  static propTypes = {
    hasError: PropTypes.bool,
    label: PropTypes.string,
    type: PropTypes.string,
    name: PropTypes.string
  };

  render() {
    let className = 'form-group';
    if (this.props.hasError) {
      className += ' has-error';
    }

    return (
      <div className={className}>
        <label htmlFor={this.props.name} className="col-sm-2 control-label">{this.props.label}</label>
        <div className="col-sm-10">
          <input type={this.props.type} className="form-control" id={this.props.name} name={this.props.name}
                 placeholder={this.props.label}/>
        </div>
      </div>
    );
  }
}

class AuthErrors extends React.Component {
  static propTypes = {
    errors: PropTypes.object
  };

  render() {
    const errors = _.values(this.props.errors);

    if (errors.length > 0) {
      return (
        <div className="callout callout-danger">
          <h4>There was a problem</h4>
          <ul>
            {
              errors.map(function (errorMessage) {
                return (
                  <li key={errorMessage}>{errorMessage}</li>
                );
              })
            }
          </ul>
        </div>
      );
    } else {
      // Don't render anything
      return <span/>;
    }
  }
}

export default Login;
