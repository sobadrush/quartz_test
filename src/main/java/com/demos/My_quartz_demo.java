package com.demos;

import java.util.Date;

import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

// http://blog.csdn.net/evankaka/article/details/45361759s
// http://yahaitt.iteye.com/blog/122720
// http://webcache.googleusercontent.com/search?q=cache:W1mIgUwxk7gJ:polinwei.blogspot.com/2008/11/java-quartz.html+&cd=2&hl=zh-TW&ct=clnk&gl=tw
public class My_quartz_demo implements Job {
	private Logger logger = Logger.getLogger(this.getClass());

	public My_quartz_demo() {
		super();
	}

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {

		System.out.println("=============================================");
		System.out.println(">>>>>>>>>>>>> 我是 MyQuartzJob <<<<<<<<<<<<<<");
		System.out.println("=============================================");

		JobDetail myJobDetail = context.getJobDetail();
		String name = myJobDetail.getJobDataMap().getString("self_defined_name");
		System.out.println("run 【" + name + "】 at " + new java.util.Date());
		logger.warn("【WARNING MSG】 Executing job: executing at " + new Date());

		System.out.println("END 【" + name + "】 at " + new java.util.Date());
		logger.warn("【WARNING MSG】 job END: END at " + new Date());

		String username = myJobDetail.getJobDataMap().getString("myAccount");
		String password = myJobDetail.getJobDataMap().getString("myPassword");
		System.out.println("myAccount : " + username);
		System.out.println("myPassword : " + password);
	}

}
