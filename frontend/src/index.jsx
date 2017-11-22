import React from 'react';
import ReactDOM from 'react-dom';
import {Router, Route, IndexRoute, createMemoryHistory} from 'react-router';
import App from './App';
import Login from './Login';
import Home from './Home';
import FormStep1 from './FormStep1';
import FormStep2 from './FormStep2';
import FormStep3 from './FormStep3';
import Loading from './Loading';
import dataStore from './dataStore';

class AppWrapper extends React.Component {
  state = {
    loading: true
  };

  componentDidMount() {
    dataStore.load()
      .then(() => this.setState({loading: false}))
      .catch((err) => console.error(err));
  }

  onAppEnter(nextState, replace) {
    // const token = auth.getToken();
    // if (!token) {
    //   replace('/login');
    // }
  }

  onLoginEnter(nextState, replace) {
    // const token = auth.getToken();
    // if (token) {
    //   replace('/');
    // }
  }

  render() {
    if (this.state.loading) {
      return <Loading/>;
    }

    return (
      <Router history={createMemoryHistory()}>
        <Route path="/login" onEnter={this.onLoginEnter.bind(this)} component={Login}/>
        <Route path="/" onEnter={this.onAppEnter.bind(this)} component={App}>
          <IndexRoute component={Home}/>
          <Route path="/step-one" component={FormStep1}/>
          <Route path="/step-two" component={FormStep2}/>
          <Route path="/step-three" component={FormStep3}/>
        </Route>
      </Router>
    );
  }
}

ReactDOM.render(<AppWrapper/>, document.getElementById('root'));
