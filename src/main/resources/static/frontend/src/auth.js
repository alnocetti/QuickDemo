const name = 'authToken';

export default {
  getToken() {
    return window.localStorage.getItem(name);
  },

  setToken(value) {
    window.localStorage.setItem(name, value);
  },

  removeToken() {
    window.localStorage.removeItem(name);
  }
}
