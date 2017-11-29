import React from 'react';
import {Link} from 'react-router';

export default class FormSuccess extends React.Component {
  render() {
    return (
      <section className="fdb-block">
        <div className="container">
          <div className="row justify-content-center">
            <div className="col-12 col-lg-8 col-xl-6 text-center">
              <h1>Success!</h1>
              <p className="text-h3">We have successfully sent your demo to the labels. Sit
                tight!</p>
              <p className="text-h3 mt-5"><Link to="/" className="btn-link">Start over</Link>
              </p>
            </div>
          </div>
        </div>
      </section>
    );
  }
}
