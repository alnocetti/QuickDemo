const path = require('path');
const webpack = require('webpack');
const DashboardPlugin = require('webpack-dashboard/plugin');
const ExtractTextPlugin = require('extract-text-webpack-plugin');

const config = {
  devtool: 'cheap-module-source-map',
  entry: ['./src/index'],
  output: {
    path: path.join(__dirname, 'dist'),
    filename: 'bundle.js',
    publicPath: '/static/'
  },
  plugins: [],
  resolve: {
    extensions: ['.js', '.jsx', '.json']
  },
  module: {
    rules: [{
      test: /\.jsx?$/,
      loader: 'babel-loader',
      include: path.join(__dirname, 'src')
    }]
  }
};

const production = process.env.NODE_ENV === 'production';

if (production) {
  config.module.rules.push({
    test: /\.css$/,
    use: ExtractTextPlugin.extract({
      fallback: 'style-loader',
      use: 'css-loader?modules,localIdentName="[name]-[local]-[hash:base64:6]"'
    })
  });
  config.plugins.push(new webpack.DefinePlugin({
    'process.env': {
      'NODE_ENV': JSON.stringify('production')
    }
  }));
  config.plugins.push(new ExtractTextPlugin('components.css'));
} else {
  config.devServer = {inline: true};
  config.entry.unshift('webpack-dev-server/client?http://localhost:3000');
  config.module.rules.push({
    test: /\.css$/,
    loaders: [
      'style-loader?sourceMap',
      'css-loader?modules&importLoaders=1&localIdentName=[path]___[name]__[local]___[hash:base64:5]'
    ],
    include: path.join(__dirname, 'src')
  });
  config.plugins.push(new DashboardPlugin());
}

module.exports = config;
