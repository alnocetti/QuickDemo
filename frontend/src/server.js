const server = {};

server.getUrl = function getUrl() {
  let url = 'http://localhost:8081';

  if (process.env.NODE_ENV === 'production') {
    url = '';
  }

  return url;
};

export default server;
