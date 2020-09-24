<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="AddServlet">
Enter Student name :
<input type="text" name="sname" />
<br/><br/>
Enter Address : 
<input type="text" name="addr"><br><br>
<select name="type1">
<option value="file">File</option>
<option value="data">Database</option>
</select>
<input type="submit">

</form>
</body>
</html>