
package za.ac.tut.web;

import java.io.IOException;
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
public class ViewBookServlet extends HttpServlet {
    
@EJB
private BookFacadeLocal bk;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Long id = Long.valueOf(request.getParameter("id"));
        
        //assign book to find method
        Book book = bk.find(id);
        
        //set attribute
        request.setAttribute("book", book);
        
        //jsp
        RequestDispatcher disp = request.getRequestDispatcher("view_book_outcome.jsp");
        disp.forward(request, response);
        
        
    }

}
