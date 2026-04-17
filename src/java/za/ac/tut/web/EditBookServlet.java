
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
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
public class EditBookServlet extends HttpServlet {

@EJB
private BookFacadeLocal bk;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        Long id = Long.valueOf(request.getParameter("id"));
        Double price = Double.valueOf(request.getParameter("price"));
        String description = request.getParameter("description");
        Integer pages = Integer.valueOf(request.getParameter("pages"));
        //find book
        Book book  = bk.find(id);
        //updated book private method
        Book updatedBook = updateBook(book, price, description, pages);
        //call edit method
        bk.edit(book);
        //jsp
        RequestDispatcher disp = request.getRequestDispatcher("edit_book_outcome.jsp");
        disp.forward(request, response);
    }

    private Book updateBook(Book book, Double price, String description, Integer pages) {
        
        book.setDescription(description);
        book.setPrice(price);
        book.setNumOfPages(pages);
        
        return book;
    }

}
