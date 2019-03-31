import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;  
public class submitServlet {
	protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		String data=request.getParameter("data");
		System.out.println("服务端收到的数据是:"+data);
		JSONObject json=JSONObject.fromObject(data);
		System.out.println("转换为JSON对象之后是:"+json);
		Hero hero=(Hero)JSONObject.toBean(json,Hero.class);
		System.out.println("转换为Hero对象之后是:"+hero);
	}
}
