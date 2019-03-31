package servlet;
import entity.User;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
public class LoginServlet extends HttpServlet{
	private static final long serialVersionUID = 6264381047408967619L;
	public void doGet(HttpServletRequest request,HttpServletResponse respsonse) throws ServletException,IOException
	{
		String username=request.getParameter("username");
		String password=request.getParameter("passwrod");
		
		if(("itcast").equals(username)&&"123456".equals(password)) {
			User user=new User();
			user.setUsername(username);
			user.setPasswrod(password);
			request.getSession().setAttribute("user", user);
			
			String autoLogin=request.getParameter("autologin");
			if(autoLogin!=null) {
				Cookie cookie=new Cookie("autologin", username+"-"+password);
				cookie.setMaxAge(Integer.parseInt(autoLogin));
				cookie.setPath(request.getContextPath());
				respsonse.addCookie(cookie);
			}
			respsonse.sendRedirect(request.getContextPath()+"/index.jsp");
		}
		else {
			request.setAttribute("errerMsg", "用户名或密码错误");
			request.getRequestDispatcher("/login.jsp").forward(request, respsonse);
		}
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException 
	{
		doGet(request,response);
	}
}
