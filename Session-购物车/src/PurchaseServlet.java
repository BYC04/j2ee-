import java.io.IOException;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
public class PurchaseServlet extends HttpServlet {
	private static final long serialVersionUTD=1L;
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
	{
		String id=req.getParameter("id");
		if(id==null) 
		{
			String url="/src/ListBookServlet";
			resp.sendRedirect(url);
			return;
		}
		Book book=BookDB.getBook(id);
		HttpSession session=req.getSession();
		List<Book> cart=(List)session.getAttribute("cart");
		if(cart==null)
		{
			cart=new ArrayList<Book>();
			session.setAttribute("cart", cart);
		}
		cart.add(book);
		Cookie cookie=new Cookie("JSESSIONID", session.getId());
		cookie.setMaxAge(60*30);
		cookie.setPath("/src");
		resp.addCookie(cookie);
		
		String url="/CartServlet";
		resp.sendRedirect(url);
	}
}
