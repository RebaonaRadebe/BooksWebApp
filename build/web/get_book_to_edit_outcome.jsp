<%-- 
    Document   : get_book_to_edit_outcome
    Created on : Apr 12, 2026, 4:32:45 PM
    Author     : Rebaona
--%>

<%@page import="za.ac.tut.model.entity.Book"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/styles.css">
        <title>Get Book To Edit Outcome Page</title>
    </head>
    <body>
        <h1>Get Book To Edit Outcome</h1>
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
        
        <form action="EditBookServlet.do" method="POST">
            
            <td><input type="hidden" name="id" value="<%=id%>" />
            
              <table>
                <tr>
                    <td>Title:</td>
                    <td><input type="text" name="title" value="<%=title%>" disabled="true" /></td>
                </tr>
                 <tr>
                    <td>Price:</td>
                    <td><input type="text" name="price" value="<%=price%>" /></td>
                </tr>
                 <tr>
                    <td>Description:</td>
                    <td><input type="text" name="description" value="<%=description%>" /></td>
                </tr>
                <tr>
                    <td>ISBN:</td>
                    <td><input type="text" name="isbn" value="<%=isbn%>" disabled="true" /></td>
                </tr>
                <tr>
                    <td>Pages:</td>
                    <td><input type="text" name="pages" value="<%=pages%>" /></td>
                </tr>
                <tr>
                    <td>Has illustrations?:</td>
                    <td><input type="text" name="illustrations" value="<%=illustrations%>" disabled="true" /></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="EDIT BOOK" /></td>
                </tr>
            </table>
        </form>
    </body>
</html>
