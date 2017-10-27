const server = {};

server.getUrl = function getUrl() {
  let url = 'http://localhost:3001';

  if (process.env.NODE_ENV === 'production') {
    url = '';
  }

  return url;
};

export default server;
