<%-- 
    Document   : shoppinglist
    Created on : Oct 4, 2018, 12:07:27 PM
    Author     : 672762
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping List</title>
    </head>
    <body>
        
        
        <h1>Shopping List</h1>
        
        <div>${welcomeMessage}</div>
        
        <h2>Your List</h2>
        
        <form action="add" method="post">
            Add item: <input type="input" value="${item}" name="item">
            <input type="submit" value="add">
        </form>
        
        
        <c:forEach items="${list}" var="item">
            <form action="delete">
                <ul>
                    <li><input type="radio">${showItem}</li>
                </ul>
                <input type="submit" value="Delete" action="delete">
            </form>
            
        </c:forEach>
        
    </body>
</html>
