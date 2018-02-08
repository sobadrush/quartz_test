package com.ctbc.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class SystemListener implements ServletContextListener {

	private static final String logFilePath = "D:\\02.project_workspaces\\_2018\\workspace_PCMS\\quartz_test\\src\\main\\webapp\\dailyLog";
	
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		
		System.setProperty("MY_LOG_PATH", logFilePath);
		
//		Properties props = System.getProperties();
//		Set<Entry<Object, Object>> eSet = props.entrySet();
//		for (Entry<Object, Object> entry : eSet) {
//			System.out.println(entry.getKey() + " : " + entry.getValue());
//		}
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
	}

}
