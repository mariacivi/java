<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2> Prodotto:</h2> 
<h3> ${prodotto.getNome()}</h3><br>
 
<h2>Prezzo:</h2>
<h3> ${prodotto.getPrezzo()}</h3><br>
 
<h2>Quantità:</h2>
<h3> ${prodotto.getQuantita()}</h3><br>
</body>
</html>