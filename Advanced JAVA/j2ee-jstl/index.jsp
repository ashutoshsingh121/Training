<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL</title>
</head>
<body>

<h1>
  <c:out value="hello jstl Its me"/>   
</h1>

<c:set var="username" scope="session" value="Ashu" />
	username=
	<c:out value="${username}" />

	<c:if test="${username.length() > 0}">
		<p>Username= ${username} found</p>
	</c:if>


<c:choose>

		<c:when test="${username.equals('Abhi')}">  
       Abhi is found  
        <h1>welcome Abhi</h1> 
    	</c:when>
    	
		<c:when test="${username.equals('Ashu')}">  
        Ashu is found  
        <h1>welcome Ashu</h1>  
    	</c:when>
    	
		<c:otherwise>  
       No clue who you are try again!
    	</c:otherwise>
    	
	</c:choose>
	
	
	<c:forEach var="i" begin="0" end="5">
		<p>
			Values are=
			<c:out value="${i}" />
		</p>
	</c:forEach>
	
	

</body>
</html>