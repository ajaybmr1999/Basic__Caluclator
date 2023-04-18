<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>calculator</title>
</head>
<body style="background-color: pink;">
	<form action="calc" method="post">
		
			<div align="center" style="border:orange; border-width:5px; border-style:solid;">
			<h1>Basic Calculator</h1>
			<hr size="10">
				<table>
					<tr>
						<td>First Number:</td>
						<td><input type="number" name="tbNum1" placeholder="enter 1st number" ></td>
					</tr>
					<tr>
						<td>Second Number:</td>
						<td><input type="number" name="tbNum2" placeholder="enter 2nd number"></td>
					</tr>
				</table>
			
			<hr size="10">
			
			<input type="submit" name="btnAdd" value="add" style="background-color: aqua;">
			<input type="submit" name="btnSub" value="sub" style="background-color: lime;">
			<input type="submit" name="btnMul" value="Mul" style="background-color: yellow;">
			<input type="submit" name="btnDiv" value="Div" style="background-color: silver;">
			<hr size="">
			</div>
		
	</form>
</body>
</html>