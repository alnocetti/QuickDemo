import React from 'react';
import ReactDOM from 'react-dom';
import {Router, Route, IndexRoute, browserHistory} from 'react-router';
import auth from './auth';
import App from './App';
import Login from './Login';
import Home from './Home';

class AppWrapper extends React.Component {
  onAppEnter(nextState, replace) {
    const token = auth.getToken();
    if (!token) {
      replace('/login');
    }
  }

  onLoginEnter(nextState, replace) {
    const token = auth.getToken();
    if (token) {
      replace('/');
    }
  }

  render() {
    return (
      <Router history={browserHistory}>
        <Route path="/login" onEnter={this.onLoginEnter.bind(this)} component={Login}/>
        <Route path="/" onEnter={this.onAppEnter.bind(this)} component={App}>
          <IndexRoute component={Home}/>
          <Route path="/example" component={Home}/>
        </Route>
      </Router>
    );
  }
}

ReactDOM.render(<AppWrapper/>, document.getElementById('root'));
