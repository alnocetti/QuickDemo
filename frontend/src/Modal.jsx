import React from 'react';
import PropTypes from 'prop-types';

class Modal extends React.Component {
  static propTypes = {
    children: PropTypes.node.isRequired,
    onAccept: PropTypes.func.isRequired,
    title: PropTypes.string.isRequired,
    acceptButtonText: PropTypes.string
  };

  constructor(props, context) {
    super(props, context);
    this.state = {open: false};
  }

  show() {
    this.setState({open: true});
  }

  hide() {
    this.setState({open: false});
  }

  render() {
    let className = 'modal fade';
    let style = {};

    if (this.state.open) {
      className += ' in';
      style = {display: 'block'};
    }

    const acceptButtonText = this.props.acceptButtonText || 'Accept';

    return (
      <div className={className} style={style}>
        <div className="modal-dialog">
          <div className="modal-content">
            <div className="modal-header">
              <h4 className="modal-title">{this.props.title}</h4>
            </div>
            <div className="modal-body">
              {this.props.children}
            </div>
            <div className="modal-footer">
              <button type="button" className="btn btn-default" onClick={this.hide}>Cancel</button>
              <button type="button" className="btn btn-primary"
                      onClick={this.props.onAccept}>{acceptButtonText}</button>
            </div>
          </div>
        </div>
      </div>
    );
  }
}

export default Modal;
