import React from 'react';
import PropTypes from 'prop-types';

export default class AuthFormInput extends React.Component {
  static contextTypes = {
    hasError: PropTypes.bool,
    label: PropTypes.string,
    type: PropTypes.string,
    name: PropTypes.string,
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
