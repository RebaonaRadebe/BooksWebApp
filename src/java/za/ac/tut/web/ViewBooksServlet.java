
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
public class ViewBooksServlet extends HttpServlet {

    @EJB
    private BookFacadeLocal bk;
            
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        //list of books
        List<Book> books = bk.findAll();
        //set attribute
        request.setAttribute("books", books);
        //jsp
        RequestDispatcher disp = request.getRequestDispatcher("view_books_outcome.jsp");
        disp.forward(request, response);
        
        
       
        
        
    }

}
