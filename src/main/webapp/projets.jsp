<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Gestion des departements</h1>
<h2>Liste des projets pour le DEPT:${dept.titre}</h2>
<table border=1>
<c:forEach items="${liste}" var="p">
      <tr>
          <td>${p.id}</td>
          <td>${p.titre}</td>
      </tr>
</c:forEach>          

</table>

</body>
</html>