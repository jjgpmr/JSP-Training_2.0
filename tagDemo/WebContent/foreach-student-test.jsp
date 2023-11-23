<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*, com.luv2code.jsp.tagdemo.Student"%>

<%
	List<Student> data = new ArrayList<>();

	data.add(new Student("Zé","Rosa", true));
	data.add(new Student("Ana","Magalhães", true));
	data.add(new Student("Maria","Rosa", false));
	
	pageContext.setAttribute("myStudents", data);
%>

<html>
	<body>
		<table border="1">
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Gold Costumer</th>
			</tr>
				<c:forEach var="tempStudents" items="${myStudents}">
					<tr>
						<td>${tempStudents.firstName}</td>
						<td>${tempStudents.lastName}</td>
						<td>${tempStudents.goldCustomer}</td>
					</tr>
					
				</c:forEach>
			
		</table>
	</body>
</html>