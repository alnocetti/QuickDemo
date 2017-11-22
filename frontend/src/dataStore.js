import api from './api';

export default {
  genres: [],
  labels: [],
  load() {
    return Promise.all([
      this.getAsPromise('/genres', 'genres'),
      this.getAsPromise('/labels', 'labels'),
    ]);
  },
  getAsPromise(path, key) {
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
