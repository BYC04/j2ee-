import java.io.*;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
public class CartServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
	{
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out=resp.getWriter();
		List<Book> cart=null;
		boolean purFlag=true;
		HttpSession session=req.getSession(false);
		if(session==null)
		{
			purFlag=false;
		}
		else 
		{
			cart=(List)session.getAttribute("cart");
			if(cart==null)
			{
				purFlag=false;
			}
		}
		if(!purFlag) {
			out.write("对不起！你还未购买<br>");
		}
		else
		{
			out.write("你购买的图书：<br>");
			for(Book book:cart) {
				out.write(book.getName()+"<br>");
			}
		}
	}
}
