package filter;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import entity.User;
public class AutoLoginFilter implements Filter{
	public void init(FilterConfig filterconfig) throws ServletException{
		
	}
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse response, FilterChain filterchain)
			throws IOException, ServletException {
		// TODO 自动生成的方法存根
		HttpServletRequest request=(HttpServletRequest)req;
		Cookie cookies[]=request.getCookies();
		String autologin=null;
		for(int i=0;cookies!=null&&i<cookies.length;i++) {
			if("autologin".equals(cookies[i].getName())) {
				autologin=cookies[i].getValue();
				break;
			}
			if(autologin!=null) {
				String parts[]=autologin.split("-");
				String username=parts[0];
				String password=parts[1];
				User user=new User();
				user.setUsername(username);
				user.setPasswrod(password);
				request.getSession().setAttribute("user", user);
			}
		}
		filterchain.doFilter(request, response);
	}
	public void destory() {
		
	}
	
}
