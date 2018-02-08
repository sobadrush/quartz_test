package com.ctbc.quartz_job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class MyQuartzJob implements Job {

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		System.out.println(context);
		System.out.println(">>>>>>>>>>>>> 我是 MyQuartzJob <<<<<<<<<<<<<<");
	}

}
