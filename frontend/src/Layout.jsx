import React from 'react';
import Header from './Header';

class AppLayout extends React.Component {
  loading = false;

  render() {
    if (this.loading) {
      return <span/>;
    }

    const wrapperStyles = {
      overflowY: 'scroll !important',
      position: 'absolute',
      left: 0,
      right: 0
    };

    const contentWrapperStyles = {
      minHeight: 1000
    };

    return (
      <div className="wrapper" style={wrapperStyles}>
        <Header/>
        <div className="content-wrapper" style={contentWrapperStyles}>
          {this.props.children}
        </div>
      </div>
    );
  }
}

class Layout extends React.Component {
  render() {
    return (
      <AppLayout>
        {this.props.children}
      </AppLayout>
    )
  }
}

export default Layout;
