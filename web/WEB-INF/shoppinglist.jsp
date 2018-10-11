<%-- 
    Document   : shoppinglist
    Created on : Oct 4, 2018, 12:07:27 PM
    Author     : 672762
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping List</title>
    </head>
    
        
        <h1>Shopping List</h1>
        
        <form action="shoppinglist?action=logout">
            <div>${welcomeMessage}</div>
        </form>
        
        <h2>Your List</h2>
        
        <form action="ShoppingList" method="post">
            Add item: <input type="input" value="${item}" name="item">
            <input type="submit" value="add">
        </form>
        
        
        <c:forEach var="item" items="${item}">
            <form action="shoppinglist?action=delete">
                <ul>
                    <li>${showItem}</li>
                </ul>
               <input type="submit" value="Delete">
            </form>
        </c:forEach>