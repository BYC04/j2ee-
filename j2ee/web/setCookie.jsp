<@ page language="java" contentType="text/html;
    charset=UTF-8" pageEncoding="UTF-8" import="javax.servlet.http.Cookie" %>
    <%
    Cookie c=new Cookie("name","Green");
    c.setMaxAge(60*24*60);
    c.setPath("/");
    response.addCookie(c);
%>
        <a href="getCookie.jsp">跳转</a>