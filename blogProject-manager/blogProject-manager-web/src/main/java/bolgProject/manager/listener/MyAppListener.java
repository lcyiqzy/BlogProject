package bolgProject.manager.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

// 项目启动的时候，将一些常用数据放在application域中，方便调用

public class MyAppListener implements ServletContextListener   {

	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		ServletContext servletContext = sce.getServletContext();
		
		String contextPath = servletContext.getContextPath();
		
		servletContext.setAttribute("ctp", contextPath);
		
	}

	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

}
