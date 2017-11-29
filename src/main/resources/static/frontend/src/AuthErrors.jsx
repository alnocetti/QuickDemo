import React from 'react';
import PropTypes from 'prop-types';
import _ from 'underscore';

export default class AuthErrors extends React.Component {
  static contextTypes = {
    errors: PropTypes.object,
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
