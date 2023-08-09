const getJSONString = function (obj) { return JSON.stringify(obj, null, 2); }

const port = 3000,
	http = require("http"),
	httpStatus = require("http-status-codes"),
	app = http.createServer();

app.on("request", (req, res) => {
	if (req.url == "/grade.html") {
		let form =
			`
			<!DOCTYPE html>
			<html>
			<head>
			<title>GRADE PROBLEM</title>
			<style>
			.problem{color:black; background-color:green; border:10px solid yellow;max-width:400px;color:white;padding:5px;padding-right:10px;border-radius:25px;}
			.problem label.title{outline:solid 7px yellow;color:black; background-color:yellow; float:left; text-align:center; width:400px;border:solid yellow 5px;font-size:1.5em;margin-bottom:5px;}
			.problem label.input{float:left; width:130px;color:black;margin-top:5px;color:white;}
			.problem label.output1{float:left; width:130px;color:red;}
			.problem label.output2{float:left; width:130px}
			.problem div{text-align: center;}
			.problem br{clear:both;}
			.problem .one,select{color:white;background-color:black; border:4px solid white; max-width:150px; float:left;border-radius:25px;margin-top:5px;padding:4px;}
			.problem .two{background-color:yellow; border:4px solid black; margin:2px; max-width:150px; float:left;border-radius:25px;padding:4px;}
			.problem .one2{background-color:red;border:4px solid black;color:white;border-radius:25px;}
			.problem .two2{background-color:red;border:4px solid red;background:black;color:lightblue;border-radius:25px;}
			</style>
			</head>
			<body>
			<form method="post" action="grade.js"class='problem'>
			<label class='title'><strong>GRADE PROBLEM</strong></label><p>
			<label class='input'>Midterm:</label> <input type="text" class='one' name="m" /><br>
			<label class='input'>Final:</label> <input type="text" class='one' name="f" /><br>
			<hr>
			<hr>
			<div>
			<input type="submit" value="Grade" class='two2' name="choice"/>
			<input type="reset" value="Clear" class='two2' />
			</div>
			</form>
			</body>
			</html>
			`;
		res.writeHead(httpStatus.OK, { "Content-Type": "text/html" });
		res.end(form);
	}

	if (req.url == "/grade.js") {
		var A = [];
		req.on("data", (bodyData) => { A.push(bodyData); });
		req.on("end", () => {
			let input = Buffer.concat(A).toString();
			console.log(`INPUT: ${input}`);
			//---------------EXTRACT DATA--------------------
			let B = input.split("&");
			let C = B[0].split("=");
			let m = parseFloat(C[1]);
			let D = B[1].split("=");
			let f = parseFloat(D[1]);
			//--------------COMPUTE ANSWER--------------------
			let average = (m + f) / 2;
			let output = "Numerical grade is " + average + "<br>";
			//I am missing the letter output
			let letter;
			// Calculate Letter Grade Based On Average
			if (average >=  90) {
				letter = 'A';
			} else if (average >= 80) {
				letter = 'B';
			} else if (average >= 70) {
				letter = 'C';
			} else if (average >= 60) {
				letter = 'D';
			} else if (average >= 50) {
				letter = 'E';
			} else {
				letter = 'F';
			}
			// Append The Letter Grade To The Output
			output += "Letter Grade is " + letter + "<br>";

			output += "<a href='grade.html'>reset</a>";
			//------------------------------------------------
			res.writeHead(httpStatus.OK, { "Content-Type": "text/html" });
			res.end(output);
		});
	}
	console.log(`Method: ${getJSONString(req.method)}`);
	console.log(`URL: ${getJSONString(req.url)}`);
	console.log(`Headers: ${getJSONString(req.headers)}`);
});

app.listen(port);
console.log(`Server has started and is listening on port#:${port}`);