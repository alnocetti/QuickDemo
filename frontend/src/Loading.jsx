import React from 'react';
import PropTypes from 'prop-types';

class Loading extends React.Component {
  static propTypes = {
    styles: PropTypes.object,
    size: PropTypes.string
  };

  render() {
    const size = this.props.size || 4;
    const styles = this.props.styles || {
        position: 'fixed',
        top: '50%',
        left: '50%',
        zIndex: 1
      };

    const className = 'fa fa-refresh fa-spin fa-' + size + 'x';

    return (
      <div style={styles}>
        <i className={className}/>
      </div>
    );
  }
}

export default Loading;
