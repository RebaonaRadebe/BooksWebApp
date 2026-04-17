
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
public class GetBookToEditServlet extends HttpServlet {

    @EJB
    private BookFacadeLocal bk;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Long id = Long.valueOf(request.getParameter("id"));
        //get book
        Book book = bk.find(id);
        //set attibute
        request.setAttribute("book", book);
        //jsp
        RequestDispatcher disp = request.getRequestDispatcher("get_book_to_edit_outcome.jsp");
        disp.forward(request, response);
        
        
    }

}
