<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Updatuser" method ="post">
<h1>Updation page</h1>
<label> Id </label>         
<input type="text" name="id" size="15"/> <br> <br>  

<label> First name </label>         
<input type="text" name="fname" size="15"/> <br> <br>  
<label> Last name: </label>     
<input type="text" name="lname" size="15"/> <br> <br> 
<label> User name </label>     
<input type="text" name="username" size="15"/> <br> <br>

<label> Password </label>     
<input type="text" name="password" /> <br> <br>  
<label> Address: </label>         
<input type="text" name="Address" size="15"/> <br> <br>
<label> Age: </label>         
<input type="text" name="age" size="15"/> <br> <br>
<tr><td><input type="submit" value="Update"></td>
			</tr>

</form>
</body>
</html>