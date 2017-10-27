import React from 'react';
import Layout from './Layout';

class App extends React.Component {
  render() {
    return (
      <Layout>
        {this.props.children}
      </Layout>
    )
  }
}

export default App;
