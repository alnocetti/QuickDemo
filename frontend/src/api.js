import axios from 'axios';
import server from './server';
import auth from './auth';

class API {
  static get (path, callback) {
    getInstance()
      .get(preventCaching(path))
      .then((result) => callback(null, result))
      .catch(onError(callback));
  }

  static post(path, body, callback) {
    getInstance()
      .post(path, body)
      .then((result) => callback(null, result))
      .catch(onError(callback));
  }

  static put(path, body, callback) {
    getInstance()
      .put(path, body)
      .then((result) => callback(null, result))
      .catch(onError(callback));
  }

  static patch(path, body, callback) {
    getInstance()
      .patch(path, body)
      .then((result) => callback(null, result))
      .catch(onError(callback));
  }

  static del(path, callback) {
    getInstance()
      .delete(path)
      .then((result) => callback(null, result))
      .catch(onError(callback));
  }
}

function getInstance() {
  const baseURL = `${server.getUrl()}/api/`;
  const instance = axios.create({baseURL});
  instance.defaults.headers.common['Authorization'] = auth.getToken();
  return instance;
}

function preventCaching(path) {
  if (path.indexOf('?') < 0) {
    path += '?';
  } else {
    path += '&';
  }
  return path + `__time=${new Date().getTime()}`;
}

function onError(callback) {
  return function (err) {
    if (err && err.response && err.response.status === 401) {
      auth.removeToken();
      window.location.reload();
    }
    callback(err, null);
  };
}

export default API;
