import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class RegisterServlet extends HttpServlet{
	protected void service (HttpServletRequest request,HttpServletResponse repsonse) 
						throws ServletException,IOException
	{
		System.out.println("获取单值参数name:"+request.getParameter("name"));
		String hobits[]=request.getParameterValues("hobits");
		
		System.out.println("遍历所有参数");
		Map<String,String[]>parameters=request.getParameterMap();
		
		Set<String> paramNames=parameters.keySet();
		for(String param:paramNames) {
			String value[]=parameters.get(param);
			System.out.println(param+":"+Arrays.asList(value));
		}
	}
}
