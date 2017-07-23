const port = 8401;

var http = require('http');
var express = require('express');
var app = express();

app.listen(port, function () {
  console.log('server admin listening on port : %s!' ,port);
});

app.get('/health', function (req, res) {
	res.setHeader("Content-Type", "application/json");
	res.write('{"status":"UP"}');
	res.end();
});

app.get('/info', function (req, res) {
	res.setHeader("Content-Type", "application/json");
	res.write('{"name":"nodeJs client"}');
	res.end();
});

app.get('/product', function (req, res) {
	
	var options = {
		host: 'localhost',
		port: 8400,
		path: '/serviceproduct/info'
	};
	
	res.setHeader("Content-Type", "application/json");
	
	http.get(options, function(resp){
		console.log('STATUS: ' + resp.statusCode);
		console.log('HEADERS: ' + JSON.stringify(resp.headers));
		resp.on('data', function(chunk){
			res.write(chunk);
			res.end();
		});
		}).on("error", function(e){
			res.write(e.message);
			res.end();
		}
	);
});