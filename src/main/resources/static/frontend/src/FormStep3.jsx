import React from 'react';
import {Link} from 'react-router';
import Select from 'react-select';
import _ from 'underscore';
import validations from './validations';
import TextField from './TextField';
import dataStore from './dataStore';
import store from './store';

export default class FormStep3 extends React.Component {
  static rules = {
    labels: [validations.notEmpty],
  };

  state = {
    labels: store.getLabels(),
    newLabel: {
      name: '',
      email: '',
    },
    errors: {},
  };

  onNewLabelFieldChange(field, event) {
    event.preventDefault();
    const {newLabel} = this.state;
    newLabel[field] = event.target.value;
    this.setState({newLabel});
  }

  onLabelsChange(value) {
    const labels = value.map(v => _.findWhere(dataStore.labels, {labelId: v.value}));
    const {errors} = this.state;
    errors.labels = false;
    this.setState({labels, errors});
  }

  onAddLabelClick(event) {
    event.preventDefault();

    const {newLabel} = this.state;
    if (!newLabel.name || !newLabel.email) return;
    // TODO: validate new label fields
    newLabel.labelId = new Date().getTime() * -1;
    dataStore.labels.push(newLabel);

    const {labels} = this.state;
    labels.push(newLabel);

    this.setState({
      labels,
      newLabel: {name: '', email: ''},
    });
  }

  onSendClick(event) {
    event.preventDefault();

    if (this.validate(this.state.labels)) {
      return;
    }

    store.setLabels(this.state.labels);
    dataStore.submit(store.getState())
      .then(() => {
        // TODO: clean application state
        this.props.router.push('/success');
      })
      .catch((err) => console.error(err));
  }

  validate(labels) {
    const obj = {labels};
    const errors = validations.validate(obj, FormStep3.rules);
    this.setState({errors});
    return Object.keys(errors).length > 0;
  }

  render() {
    const selected = this.state.labels.map(l => ({value: l.labelId, label: l.name}));
    const options = dataStore.labels.map(l => ({value: l.labelId, label: l.name}));
    const {newLabel, errors} = this.state;

    return (
      <section className="fdb-block">
        <div className="container">
          <div className="row justify-content-center">
            <div className="col-12 col-md-8 col-lg-8 col-xl-6">
              <div className="row">
                <div className="col text-center">
                  <h1>Labels</h1>
                  <p className="text-h3">Last step! Please, select one or more labels.</p>
                </div>
              </div>
              <div className="row align-items-center mt-4">
                <div className="col">
                  <Select value={selected} options={options}
                          style={errors['labels'] ? {borderColor: '#de4d4f'} : {}}
                          onChange={this.onLabelsChange.bind(this)} multi/>
                </div>
              </div>
              <div className="row text-center justify-content-center mt-4 mb-0">
                <p className="text">Can't find the label you're looking for? No problem! Add it yourself.</p>
              </div>
              <div className="row align-items-center mt-0">
                <div className="col">
                  <TextField id="new-label-name" type="text" label="Label Name"
                             value={newLabel.name} onChange={this.onNewLabelFieldChange.bind(this, 'name')}/>
                </div>
                <div className="col">
                  <TextField id="new-label-email" type="text" label="Label Email"
                             value={newLabel.email} onChange={this.onNewLabelFieldChange.bind(this, 'email')}/>
                </div>
                <div className="col">
                  <button className="btn btn-empty" style={{width: '100%'}} type="button"
                          onClick={this.onAddLabelClick.bind(this)}>Add Label
                  </button>
                </div>
              </div>
              <div className="row text-center justify-content-center mt-4">
                <p className="text">Look for labels information on <a href="https://labelsbase.net"
                                                                      target="_blank">Labels Base</a>.</p>
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
