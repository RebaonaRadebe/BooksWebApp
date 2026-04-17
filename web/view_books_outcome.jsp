<%-- 
    Document   : view_books_outcome
    Created on : Apr 12, 2026, 3:40:25 PM
    Author     : Rebaona
--%>

<%@page import="java.util.List"%>
<%@page import="za.ac.tut.model.entity.Book"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Books page</title>
    </head>
    <body>
        <h1>View Book</h1>
        
        <%
            List<Book> books = (List<Book>)request.getAttribute("books");
        %>
        
        <p>
            List of books stored:
        </p>
        
        <table border="1">
            <th>ID: </th>
            <th>Title: </th>
            <th>Price: </th>
            <th>Description: </th>
            <th>ISBN: </th>
            <th>Pages: </th>
            <th>Has illustrations?: </th>
            
            <%
                for(int i=0; i<books.size(); i++)
                {
                    
                    Book book = books.get(i);
                    Long id = book.getId();
                    String title = book.getTitle();
                    Double price = book.getPrice();
                    String description = book.getDescription();
                    String isbn = book.getIsbn();
                    Integer pages = book.getNumOfPages();
                    Boolean illustrations = book.getIllustrations();
                  
            %>
            
            <tr>
                <td><%=id%></td>
                <td><%=title%></td>
                <td><%=price%></td>
                <td><%=description%></td>
                <td><%=isbn%></td>
                <td><%=pages%></td>
                <td><%=illustrations%></td>
            </tr>
            
            <%
                }
            %>
            
            <ol>
            <li><a href="menu.html">Menu Page</a></li>
            <li><a href="index.html">Home Page</a></li>
            </ol>
            
        </table>
    </body>
</html>
