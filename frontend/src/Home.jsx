import React from 'react';
import {Link} from 'react-router';

export default class Home extends React.Component {
  render() {
    return (
      <section className="fdb-block">
        <div className="container">
          <div className="row justify-content-center">
            <div className="col-12 col-lg-8 col-xl-6 text-center">
              <img alt="QuickDemo" width="400" src="/assets/logo.png"/>
              <h1>Send your demos effectively</h1>
              <p className="text-h3">The easiest and most effective way of sending your demos and get signed. And it's
                FREE!</p>
              <p className="text-h3 mt-5"><Link to="/step-one" className="btn btn-round">Get started now</Link>
              </p>
            </div>
          </div>
        </div>
      </section>
    );
  }
}
