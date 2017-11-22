import React from 'react';
import {Link} from 'react-router';
import TextField from './TextField';
import store from './store';

export default class FormStep3 extends React.Component {
  state = {
    labels: store.getLabels()
  };

  onFieldChange(field, event) {
    event.preventDefault();
    const {labels} = this.state;
    labels[field] = event.target.value;
    this.setState({labels});
  }

  onSendClick(event) {
    event.preventDefault();
    // TODO: validate
    store.setLabels(this.state.labels);
    // TODO: call API
  }

  render() {
    const {labels} = this.state;
    return (
      <section className="fdb-block">
        <div className="container">
          <div className="row justify-content-center">
            <div className="col-12 col-md-8 col-lg-8 col-xl-6">
              <div className="row">
                <div className="col text-center">
                  <h1>Label</h1>
                  <p className="text-h3">Last step! Please, complete the label information below.</p>
                </div>
              </div>
              <div className="row align-items-center mt-4">
                <div className="col">
                  <TextField id="label-name" type="text" label="Label Name"/>
                </div>
                <div className="col">
                  <TextField id="label-email" type="email" label="Label Email"/>
                </div>
              </div>
              <div className="row text-center justify-content-center mt-4">
                <div className="col">
                  <p className="text">Look for the label information on <a href="https://labelsbase.net"
                                                                           target="_blank">Labels Base</a>.</p>
                </div>
              </div>
              <div className="row align-items-center mt-4">
                <div className="col">
                  <div className="d-flex justify-content-start">
                    <Link to="/step-two" className="btn-link mt-4">Previous</Link>
                  </div>
                </div>
                <div className="col">
                  <div className="d-flex justify-content-end">
                    <button className="btn mt-4" onClick={this.onSendClick.bind(this)}>Send</button>
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
