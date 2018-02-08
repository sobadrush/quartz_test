package com.demos;

import java.util.Date;

import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class job_mail_demo implements Job {
	private static Logger logger = Logger.getLogger(job_mail_demo.class.getName());

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		
		System.out.println("=============================================");
		System.out.println(">>>>>>>>>>>>> 我是 MyQuartzJob <<<<<<<<<<<<<<");
		System.out.println("=============================================");
		
		String name = context.getJobDetail().getJobDataMap().getString("name");
		System.out.println("run " + name + " at " + new java.util.Date());
		logger.warn("Executing job: executing at " + new Date());

		try {
//			BA_TOOLS tools = BA_TOOLS.getInstance();
//			tools.sendmail("localhost", "polin.wei@mail.com", "polin.wei@mail.com", "Schedule Job Demo",
//					"Schedule Job Demo");
			System.out.println("END " + name + " at " + new java.util.Date());
			logger.warn("job END: END at " + new Date());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
