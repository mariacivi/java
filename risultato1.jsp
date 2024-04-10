<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ page import = "java.util.ArrayList"%>
<%@ page import = "Prodotto.Prodotto"%>
<%
ArrayList<Prodotto> lista= (ArrayList)request.getAttribute("lista");

if (lista == null){
	out.print("E' null");
}
else {
%> <ul> <% 
for (int i = 0; i < lista.size(); i++){
	out.print("<li>"+ lista.get(i).getId());
	out.print(" prezzo: " + lista.get(i).getPrezzo()+ " , costa ");
	out.print(lista.get(i).getQuantita()+" unità. </li>");
	out.print("<br>");
	
}}

%>
</ul>
</body>
</html>