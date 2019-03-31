package servlet;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Product;
import dao.ProductDAO;
public class ProductListServlet extends HttpServlet{
	protected void service(HttpServletRequest req,HttpServletResponse res)  throws ServletException,IOException
	{
		List<Product> products=new ProductDAO().ListProduct();
		req.setAttribute("products", products);
		req.getRequestDispatcher("listProduct.jsp").forward(req,res);
	}
}
