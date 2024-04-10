<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<%
String[] lista = (String[])request.getAttribute("lista");
out.print("Hai ordinato");
out.print("<hr>");
for (String prod: lista){
	out.print(prod);
	out.print("<hr>");
}

%>
<p>Prodotti ordinati con successo, al prezzo di ${prezzototale} euro.</p>
<br>
</body>
</html>