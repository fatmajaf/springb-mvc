<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br/><br/><br/>
 <div id="formProducts">
 <f:form modelAttribute="user" method="post" action="saveUser">
 <table border="1">
 <tr><th>Prénom:</th><td><f:input path="firstName" /></td></tr>
 <tr><th>Nom:</th><td><f:input path="lastName" /></td></tr>
 <f:hidden path="id" />
 <tr><td><input type="submit" value="Save"></td></tr>
</table>
</f:form>
</div>
<div id="listProducts">
 <table class="table1" border="1">
 <tr>
 <th>ID</th>
 <th>Prénom</th>
 <th>Nom</th>
 </tr>
 <c:forEach items="${users}" var="u">
 <tr>
 <td>${u.id}</td>
 <td>${u.firstName}</td>
 <td>${u.lastName}</td>
 <td><a href="deleteUser?id=${u.id}">Supprimer</a></td>
 <td><a href="editUser?id=${u.id}">Modifier</a></td>
 </tr>
 </c:forEach>
 </table>
 </div>

</body>
</html>