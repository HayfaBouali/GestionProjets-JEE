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
<h1>Liste des departements</h1>
<table>
<c:forEach items="${liste}" var="d" >
     <tr>
         <td> ${d.id} </td>
         <td> ${d.titre} </td>
         <td> <a href="ListeProjets?id=${d.id }">  projets</a> </td>
    </tr>     
    </c:forEach>
</table>

</body>
</html>