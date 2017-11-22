const store = {
  artist: {
    realName: '',
    artistName: '',
    email: '',
    birthday: ''
  },
  demo: {
    fileId: '',
    name: '',
    genreId: 0,
    year: 2017
  },
  labels: []
};

export default {
  getState() {
    return store;
  },
  getArtist() {
    return store.artist;
  },
  setArtist(artist) {
    store.artist = artist;
  },
  getDemo() {
    return store.demo;
  },
  setDemo(demo) {
    store.demo = demo;
  },
  getLabels() {
    return store.labels;
  },
  setLabels(labels) {
    store.labels = labels;
  },
};
