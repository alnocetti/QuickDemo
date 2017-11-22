import api from './api';

export default {
  genres: [],
  labels: [],
  load() {
    return Promise.all([
      this._getAsPromise('/genres', 'genres'),
      this._getAsPromise('/labels', 'labels'),
    ]);
  },
  submit(body) {
    return new Promise((resolve, reject) => {
      api.post('/demos', body, (err) => {
        if (err) {
          return reject(err);
        }

        resolve();
      });
    });
  },
  _getAsPromise(path, key) {
    return new Promise((resolve, reject) => {
      api.get(path, (err, result) => {
        if (err) {
          return reject(err);
        }

        this[key] = result.data;
        resolve();
      });
    });
  }
}
