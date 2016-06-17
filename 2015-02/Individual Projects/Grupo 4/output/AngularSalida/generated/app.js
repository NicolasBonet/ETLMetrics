// SET UP =======================================
var express = require('express');
//var cors = require('cors');
var app = express();

// VARIABLES =======================================
var src = __dirname;
var sitename = "web-api-muliplataforma"
var port = 42021;

// FUNCTIONS ================================
function setFile(response, path){
	return response.sendFile(src + '/views/' + path + '.html');
}

// CONFIGURATION ================================
app.use(express.static(src));
app.listen(port);
console.log(sitename + ' en ejecución (Puerto ' + port + ')');


// ROUTES =======================================
app.all('/*', function(request, response, next) {
	response.sendFile(src + '/app/views/index.html');
	//setFile(response, 'index');
});


// CORS =========================================

// app.use(cors());
//
// app.use(function(req, res, next) {
// 	res.header("Access-Control-Allow-Origin", "*");
// 	res.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
// 	next();
// });
//
// app.get('/', function(req, res, next) {
//   	// Handle the get for this route
// });
//
// app.post('/', function(req, res, next) {
//  	// Handle the post for this route
// });



// app.get('/products/:id', function(req, res, next){
// 	res.json({msg: 'This is CORS-enabled for all origins!'});
// });
// app.listen(8080, function(){
// 	console.log('CORS-enabled web server listening on port 80');
// });

// Just send the index.html for other files to support HTML5Mode
//res.sendFile('index.html', { root: __dirname });
