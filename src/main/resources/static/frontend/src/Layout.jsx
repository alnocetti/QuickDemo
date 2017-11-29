import React from 'react';
import CSSModules from 'react-css-modules';
import styles from './Layout.css';

class Layout extends React.Component {
  loading = false;

  render() {
    if (this.loading) {
      return <span/>;
    }

    return (
      <div className={`wrapper ${styles.wrapper}`}>
        <div className="content-wrapper">
          {this.props.children}
        </div>
      </div>
    );
  }
}

export default CSSModules(Layout, styles);
