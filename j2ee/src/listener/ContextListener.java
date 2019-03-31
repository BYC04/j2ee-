package listener;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletContextEvent;
public class ContextListener implements ServletContextListener{
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("web应用销毁");
	}
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("web应用初始化");
	}
}
