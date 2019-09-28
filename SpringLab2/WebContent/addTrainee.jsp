<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Enter Trainee details</h2>
<form  action="add" method="post" modelAttribute="trainee">
<table>
<tr>
<td>Trainee Id:-</td>
<td><input type="text" placeholder="enter id" name="traineeId"/></td>
</tr>
<tr>
<td>Trainee Name:-</td>
<td><input type="text" placeholder="enter name" name="traineeName"/></td>
</tr>
<tr><td>Trainee Location:-</td>
<td><input type="radio" value="Chennai" name="traineeLocation"/>Chennai
	<input type="radio" value="Banglore" name="traineeLocation"/>Bangalore
	<input type="radio" value="Pune" name="traineeLocation"/>Pune
	<input type="radio" value="Mumbai" name="traineeLocation"/>Mumbai</td>
	</tr>
<tr><td>Trainee Domain:-</td>
<td><select name="traineeDomain">
	<option value="Java">Java</option>
	<option value=".Net">.Net</option>
	<option value="Android">Android</option>
</select></td></tr>
<tr><td><input type="submit" value="Add Trainee"/></td>
<td><input type="Reset" value="Reset"/></td></tr></table></form>
<h3>${msg }</h3>

</body>
</html>