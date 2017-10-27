import React from 'react';
import {Link} from 'react-router';
import auth from './auth';

export default class Header extends React.Component {
  constructor(props, context) {
    super(props, context);
  }

  onSignOutClick(event) {
    event.preventDefault();
    auth.removeToken();
    window.location.reload();
  }

  render() {
    const email = 'example@example.com';
    return (
      <header className="main-header">
        <a href="/" className="logo">
          <span className="logo-mini">QuickDemo</span>
          <span className="logo-lg">QuickDemo</span>
        </a>
        <nav className="navbar navbar-static-top" role="navigation">
          <a href="#" className="sidebar-toggle" ref="sidebarToggle" role="button">
            <span className="sr-only">Toggle navigation</span>
          </a>
          <div className="navbar-custom-menu">
            <ul className="nav navbar-nav">
              <li className="dropdown user user-menu">
                <a href="#" className="dropdown-toggle" data-toggle="dropdown">
                  <img src="/assets/img/avatar.png" className="user-image" alt="User Image"/>
                  <span className="hidden-xs">{email}</span>
                </a>
                <ul className="dropdown-menu">
                  <li className="user-header">
                    <img src="/assets/img/avatar.png" className="img-circle" alt="User Image"/>
                    <p>
                      {email}
                      <small/>
                    </p>
                  </li>
                  <li className="user-footer">
                    <div className="pull-left">
                      <Link to="/change-password" className="btn btn-default btn-flat">Change password</Link>
                    </div>
                    <div className="pull-right">
                      <a onClick={this.onSignOutClick} className="btn btn-default btn-flat">Sign out</a>
                    </div>
                  </li>
                </ul>
              </li>
            </ul>
          </div>
        </nav>
      </header>
    );
  }
}
