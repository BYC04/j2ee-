
import java.io.*;
import java.util.Collection;
import javax.servlet.ServletException;
import javax.servlet.http.*;
public class ListBookServlet extends HttpServlet {
    private static final long serialVersionUTD=1L;
    public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out=resp.getWriter();
        Collection<Book> books=BookDB.getAll();
        out.write("本站有所图书:<br>");
        for(Book book:books){
            String url="/src/PurchaseServlet? id="+book.getId();
            out.write(book.getName()+"<a href='"+url+"'>点击购买</a><br>");
        }
    }
}
