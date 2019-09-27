package com.lxk.springbootdouble.untils.quartzfile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

/**
 * 启动定时任务工厂监听配置
 * 
 * @author fcc
 *
 */
@Configuration
public class StartSchedulerListener implements ApplicationListener<ApplicationEvent> {

	private static final Logger log = LoggerFactory.getLogger(StartSchedulerListener.class);

	@Autowired
	private SchedulerFactory schedulerFactory;

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		try {
			if (event instanceof ContextRefreshedEvent) {//当Spring容器初始化完成或者刷新时
				log.info("进入StartSchedulerListener.onApplicationEvent(), 开始启动所有定时任务");
				// 启动所有定时任务
				schedulerFactory.startJobs();
				log.info("离开StartSchedulerListener.onApplicationEvent(), 所有定时任务启动完成");
			} else if (event instanceof ContextClosedEvent) {//当Spring容器关闭时
				log.info("进入StartSchedulerListener.onApplicationEvent(), 开始销毁所有定时任务");
				// 关闭所有定时任务
				schedulerFactory.shutdownJobs();
				log.info("离开StartSchedulerListener.onApplicationEvent(), 所有定时任务销毁完成");
			}
		} catch (Exception e) {
			log.error("事件监听器操作出现异常: {}", e);
		}
	}

	/**
	 * 注入任务调度程序工厂
	 * 
	 * @param jobFactory 任务工厂
	 * @return
	 */
	@Bean
	public SchedulerFactoryBean schedulerFactoryBean(JobFactory jobFactory) {
		SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();
		schedulerFactoryBean.setJobFactory(jobFactory);
		return schedulerFactoryBean;
	}

}
