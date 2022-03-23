<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> MOVIES NAME</title>
</head>
<body>
<form action="saveMovies.do">
  <label> Enter Movie Name: </label>
  <input type="text"  placeholder="movie name" name="movieName">  <br><br>
  <label> Enter Actor Name: </label>
  <input  type="text" placeholder="actor name"  name="actorName"> <br>
  <input type="submit"  value="save">
</form>
</body>
</html>