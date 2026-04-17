<%-- 
    Document   : view_book_outcome
    Created on : Apr 12, 2026, 3:06:47 PM
    Author     : Rebaona
--%>

<%@page import="za.ac.tut.model.entity.Book"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Book Outcome Page</title>
    </head>
    <body>
        <h1>View Book Outcome</h1>
        
        <p>Details of requested book:</p>
        <%
            Book book = (Book)request.getAttribute("book");
            Long id = book.getId();
            String title = book.getTitle();
            Double price = book.getPrice();
            String description = book.getDescription();
            String isbn = book.getIsbn();
            Integer pages = book.getNumOfPages();
            Boolean illustrations = book.getIllustrations();
        
        %>
        
        <table border="1">
            <tr>
                <td>ID: </td>
                <td><%=id%></td>
            </tr>
            <tr>
                <td>Title: </td>
                <td><%=title%></td>
            </tr>
            <tr>
                <td>Price(R): </td>
                <td><%=price%></td>
            </tr>
            <tr>
                <td>Description: </td>
                <td><%=description%></td>
            </tr>
            <tr>
                <td>ISBN: </td>
                <td><%=isbn%></td>
            </tr>
            <tr>
                <td>Number of pages: </td>
                <td><%=pages%></td>
            </tr>
            <tr>
                <td>Has illustrations?: </td>
                <td><%=illustrations%></td>
            </tr>
        </table>
            
            <ol>
            <li><a href="menu.html">Menu Page</a></li>
            <li><a href="index.html">Home Page</a></li>
        </ol>
        
    </body>
</html>
