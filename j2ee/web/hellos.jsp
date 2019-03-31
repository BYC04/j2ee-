
<%@page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
 
你好 JSP
<%=new Date().toLocaleString()%>

<jsp:include page="footer.jsp">
	<jsp:param  name="year" value="2019" />
</jsp:include>

