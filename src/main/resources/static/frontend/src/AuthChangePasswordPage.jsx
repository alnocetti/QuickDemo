import React from 'react';
import PropTypes from 'prop-types';
import _ from 'underscore';
import AuthErrors from './AuthErrors';
import AuthFormInput from './AuthFormInput';

export default class AuthChangePasswordPage extends React.Component {
  static contextTypes = {
    router: PropTypes.any,
  };

  constructor(props, context) {
    super(props, context);
    this.state = {
      errors: {},
    };
  }

  onSubmit(event) {
    event.preventDefault();
    const errors = {};

    this.setState({errors});

    const oldPassword = event.target.oldPassword.value;
    const newPassword = event.target.newPassword.value;

    if (!oldPassword) {
      errors.email = 'Old Password required';
    }

    if (!newPassword) {
      errors.password = 'New Password required';
    }

    if (!_.isEmpty(errors)) {
      this.setState({errors});
      return;
    }

    this.props.currentUserStore.changePassword(oldPassword, newPassword)
      .then(() => {
        this.props.router.push('/');
      })
      .catch((err) => {
        console.error(err);
      });
  }

  render() {
    return (
      <div>
        <section className="content-header">
          <h1>Change Password</h1>
        </section>
        <section className="content">
          <div className="row">
            <div className="col-md-12">
              <div className="box box-primary">
                <div className="box-body">
                  <form className="form-horizontal" onSubmit={this.onSubmit.bind(this)}>
                    <AuthErrors errors={this.state.errors}/>
                    <div className="box-body">
                      <AuthFormInput
                        hasError={!!this.state.errors.oldPassword}
                        label="Old Password"
                        name="oldPassword"
                        type="password"
                      />
                      <AuthFormInput
                        hasError={!!this.state.errors.newPassword}
                        label="New Password"
                        name="newPassword"
                        type="password"
                      />
                    </div>
                    <div className="box-footer">
                      <button type="submit" className="btn btn-info pull-right">Change Password</button>
                    </div>
                  </form>
                </div>
              </div>
            </div>
          </div>
        </section>
      </div>
    );
  }
}
