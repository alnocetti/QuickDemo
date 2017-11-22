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
  label: [{
    name: '',
    email: ''
  }]
};

export default {
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
    return store.label;
  },
  setLabels(label) {
    store.label = label;
  },
};
