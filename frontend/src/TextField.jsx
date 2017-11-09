import React from 'react';
import PropTypes from 'prop-types';
import CSSModules from 'react-css-modules';
import styles from './TextField.css';

class TextField extends React.Component {
  static propTypes = {
    id: PropTypes.string.isRequired,
    type: PropTypes.string.isRequired,
    label: PropTypes.string.isRequired,
  };

  render() {
    return (
      <div className={styles.textFieldContainer}>
        <input id={this.props.id} type={this.props.type} className="form-control" placeholder={this.props.label}/>
        <label htmlFor={this.props.id}>{this.props.label}</label>
      </div>
    );
  }
}

export default CSSModules(TextField, styles);
