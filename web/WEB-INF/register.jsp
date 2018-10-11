<%-- 
    Document   : register
    Created on : Oct 4, 2018, 12:07:14 PM
    Author     : 672762
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping List: Register</title>
    </head>
    <body>
        <h1>Shopping List</h1>
        
        <form method="post" action="ShoppingList">
            Username: <input type="text" name="user">
            <input type="submit" value="register" name="action">
            <br>
            <div>${message}</div>
        </form>
        
        
    </body>
</html>
