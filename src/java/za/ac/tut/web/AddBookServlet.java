
package za.ac.tut.web;

import java.io.IOException;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.bl.BookFacadeLocal;
import za.ac.tut.model.entity.Book;

/**
 *
 * @author Rebaona
 */
public class AddBookServlet extends HttpServlet {
@EJB 
private BookFacadeLocal bk;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String title = request.getParameter("title");
        Double price = Double.valueOf(request.getParameter("price"));
        String description = request.getParameter("description");
        String isbn = request.getParameter("isbn");
        Integer pages = Integer.valueOf(request.getParameter("pages"));
        Boolean illustrations = Boolean.valueOf(request.getParameter("illustrations"));
        // assign book to private createBook method
        Book book = createBook(title, price, description, isbn, pages, illustrations);
        bk.create(book);
        System.out.println("BOOK SENT TO EJB: " + book.getTitle());
        
        //jsp
        RequestDispatcher disp = request.getRequestDispatcher("add_book_outcome.jsp");
        disp.forward(request, response);
        
    }

    private Book createBook(String title, Double price, String description, String bn, Integer pages, Boolean illustrations) {
       
        Book book = new Book();
        book.setTitle(title);
        book.setPrice(price);
        book.setDescription(description);
        book.setIsbn(bn);
        book.setNumOfPages(pages);
        book.setIllustrations(illustrations);
        book.setCreationDate(new java.sql.Timestamp(System.currentTimeMillis()));
        
        return book;
    }

}
