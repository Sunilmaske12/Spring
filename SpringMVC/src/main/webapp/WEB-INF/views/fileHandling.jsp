<html>
	<head>
		<title>Image uploading</title>
	</head>
	<body>
		<div style="width: 500px; height: 300px; background-color: yellow; margin-left: 20%; margin-top: 10%; padding: 20px;" >
		<h3>Upload image</h3>
		<form action="uploadImage" method="post" enctype="multipart/form-data">
			<label>Choose a file</label><br>
			<input type="file" name="image" >
			<br>
			<button type="submit">Submit</button>
		</form>
		</div>
	</body>

</html>