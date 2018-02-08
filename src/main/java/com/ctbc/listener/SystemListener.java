package com.ctbc.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class SystemListener implements ServletContextListener {

	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		
		String LOG_FILE_PATH = sce.getServletContext().getInitParameter("LOG_FILE_PATH");
		System.setProperty("MY_LOG_PATH", LOG_FILE_PATH);
		
//		Properties props = System.getProperties();
//		Set<Entry<Object, Object>> eSet = props.entrySet();
//		for (Entry<Object, Object> entry : eSet) {
//			System.out.println(entry.getKey() + " : " + entry.getValue());
//		}
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
	}

}
