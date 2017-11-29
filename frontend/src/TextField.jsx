import React from 'react';
import PropTypes from 'prop-types';
import CSSModules from 'react-css-modules';
import styles from './TextField.css';

class TextField extends React.Component {
  static propTypes = {
    id: PropTypes.string.isRequired,
    type: PropTypes.string.isRequired,
    label: PropTypes.string.isRequired,
    value: PropTypes.oneOfType([
      PropTypes.string,
      PropTypes.number
    ]),
    onChange: PropTypes.func,
    hasError: PropTypes.bool,
  };

  render() {
    const containerClasses = [styles.textFieldContainer];
    if (this.props.hasError) {
      containerClasses.push(styles.hasError);
    }

    return (
      <div className={containerClasses.join(' ')}>
        <input className="form-control" id={this.props.id} type={this.props.type} placeholder={this.props.label}
               value={this.props.value} onChange={this.props.onChange}/>
        <label htmlFor={this.props.id}>{this.props.label}</label>
      </div>
    );
  }
}

export default CSSModules(TextField, styles);
