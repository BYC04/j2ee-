package listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
public class SessionListener implements HttpSessionListener {
	
	public void sessionCreated(HttpSessionEvent e) 
	{
		System.out.println("监听到session创建的sessionId:"+e.getSession().getId());
	}
	public void sessionDestoryed(HttpSessionEvent e)
	{
		System.out.println("监听到session销毁的sessionId"+e.getSession().getId());
	}
}
