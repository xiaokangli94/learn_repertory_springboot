package com.lxk.springbootdouble.untils.quartzfile;

import com.lxk.springbootdouble.entity.db1.QuartzConfig;
import com.lxk.springbootdouble.mapper.db1.QuartzConfigMapper;
import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
import org.apache.commons.lang3.StringUtils;
import org.quartz.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 定时任务调度工厂
 * 
 * @author fcc
 *
 */
@Component
public class SchedulerFactory {

	private static final Logger log = LoggerFactory.getLogger(SchedulerFactory.class);

	/**
	 * 自动分配邮件定时任务Key
	 */
	//private static final String AUTO_ASSIGN_MAIL_KEY = "assignMailJobKey";

	/**
	 * 自动分配邮件定时任务Group
	 */
	//private static final String AUTO_ASSIGN_MAIL_GROUP = "assignMailJobGroup";


	@Autowired
	private QuartzConfigMapper quartzConfigMapper;

	@Autowired
	private SchedulerFactoryBean schedulerFactoryBean;

	/**
	 * 启动所有定时任务
	 * 
	 * @throws SchedulerException
	 * @throws ClassNotFoundException
	 */
	public void startJobs() throws SchedulerException, ClassNotFoundException {
		log.debug("开始执行SchedulerFactory.startJobs(), 启动所有定时任务");
		// 获取定时任务调度程序
		Scheduler scheduler = schedulerFactoryBean.getScheduler();
		// 为了避免org.quartz.ObjectAlreadyExistsException，在执行前将scheduler进行清理
		scheduler.clear();
		List<QuartzConfig> configList = quartzConfigMapper.queryAll();
		log.debug("查询所有定时任务信息: {}", configList);
		for (QuartzConfig config : configList) {
			if (config.getStatus() == QuartzConstant.JOB_STARTER) {
				addJob(scheduler, config);
			}
		}
		log.debug("结束执行SchedulerFactory.startJobs(), 启动所有定时任务完成");
	}


	/**
	 * 删除
	 * @param quartzConfigId
	 * @throws SchedulerException
	 * @throws MessagingException
	 */
	public void deleteJob(Integer quartzConfigId) throws SchedulerException, MessagingException {
		log.debug("开始执行SchedulerFactory.deleteJob(), 根据定时任务配置表主键删除定时任务, 配置主键: {}", quartzConfigId);
		Scheduler scheduler = schedulerFactoryBean.getScheduler();
		QuartzConfig config = quartzConfigMapper.selectByPrimaryKey(quartzConfigId);
		if (config != null) {
			JobKey jobKey = JobKey.jobKey(config.getQuartzName(), config.getQuartzGroup());
			TriggerKey triggerKey = TriggerKey.triggerKey(config.getQuartzName(), config.getQuartzGroup());
			scheduler.pauseTrigger(triggerKey);// 停止触发器
			scheduler.unscheduleJob(triggerKey);// 移除触发器
			scheduler.deleteJob(jobKey);// 删除任务
			// 删除定时任务记录
			quartzConfigMapper.deleteByPrimaryKey(config.getId());
		}
		log.debug("结束执行SchedulerFactory.deleteJob()");
	}

	/**
	 * 根据邮箱编号启动定时任务
	 * 
	 * @param mailboxId 邮箱编号
	 * @param mailboxConfig      邮箱配置信息
	 * @throws SchedulerException
	 * @throws ClassNotFoundException
	 *//*
	public void addAndUpdateJob(MailboxConfig mailboxConfig) throws SchedulerException, ClassNotFoundException {
		log.debug("开始执行MailSchedulerFactory.addAndUpdateJob(), 根据邮箱编号添加或修改定时任务, 邮箱信息: {}", mailboxConfig);
		Scheduler scheduler = schedulerFactoryBean.getScheduler();
		MailQuartzConfig config = mailQuartzConfigService.findByMailboxId(mailboxConfig.getId());
		log.debug("查询定时任务信息: {}", config);
		if (config == null) {
			// 创建定时任务对象
			config = new MailQuartzConfig();
			config.setEntId(mailboxConfig.getEntId());
			config.setMailboxId(mailboxConfig.getId());
			config.setQuartzName(mailboxConfig.getAccount());
			config.setQuartzGroup(mailboxConfig.getEntId());
			config.setQuartzClass("com.huayunworld.cca.config.quartz.ReceivingMailJob");
			config.setTimespan(mailboxConfig.getAutoReceiveTimeSpan());
			config.setCreateTime(new Date());
			config.setCreateUser(ShiroUtils.getAccountId());
			// 插入定时任务数据
			mailQuartzConfigService.addMailQuartzConfig(config);
		} else {
			// 更新定时任务对象信息
			config.setTimespan(mailboxConfig.getAutoReceiveTimeSpan());
			config.setUpdateTime(new Date());
			config.setUpdateUser(ShiroUtils.getAccountId());
			// 执行更新操作
			mailQuartzConfigService.updateMailQuartzConfig(config);
		}
		JobKey jobKey = JobKey.jobKey(config.getQuartzName(), config.getQuartzGroup());
		TriggerKey triggerKey = TriggerKey.triggerKey(config.getQuartzName(), config.getQuartzGroup());
		JobDetail jobDetail = scheduler.getJobDetail(jobKey);
		if (jobDetail == null) {
			addJob(scheduler, config);
			log.info("{}邮箱定时接收任务已添加, 接收时间间隔: {}", mailboxConfig.getAccount(), mailboxConfig.getAutoReceiveTimeSpan());
		} else {
			scheduler.pauseTrigger(triggerKey);// 停止触发器
			scheduler.unscheduleJob(triggerKey);// 移除触发器
			scheduler.deleteJob(jobKey);// 删除任务
			addJob(scheduler, config);// 添加任务
			log.info("{}邮箱定时接收任务已更新, 接收时间间隔: {}", mailboxConfig.getAccount(), mailboxConfig.getAutoReceiveTimeSpan());
		}

		log.debug("结束执行MailSchedulerFactory.addAndUpdateJob()");
	}*/

	/**
	 * 添加定时任务
	 * 
	 * @param scheduler 定时任务调度程序
	 * @param config    定时任务信息
	 * @throws ClassNotFoundException
	 * @throws SchedulerException
	 */
	private void addJob(Scheduler scheduler, QuartzConfig config) throws ClassNotFoundException, SchedulerException {
		// 获取定时任务标识符
		JobKey jobKey = JobKey.jobKey(config.getQuartzName(), config.getQuartzGroup());
		// 获取定时任务信息
		JobDetail jobDetail = scheduler.getJobDetail(jobKey);
		if (jobDetail == null) {// 如果定时任务不存在
			if (StringUtils.isNoneBlank(config.getQuartzClass())) {// 如果定时任务执行操作类存在
				@SuppressWarnings("unchecked")
				Class<? extends Job> clazz = (Class<? extends Job>) Class.forName(config.getQuartzClass());
				// 增加接口唯一标识参数
				jobDetail = JobBuilder.newJob(clazz).usingJobData("interiorApiSign", config.getInteriorApiSign()).withIdentity(config.getQuartzName(), config.getQuartzGroup()).build();
				//根据cron表达式配置定时任务
				CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule(config.getTimespan());
				CronTrigger cronTrigger = TriggerBuilder.newTrigger().withIdentity(config.getQuartzName(), config.getQuartzGroup()).withSchedule(cronScheduleBuilder).build();

				scheduler.scheduleJob(jobDetail, cronTrigger);
			}
		}
	}

	/**
	 * 停止所有定时任务
	 * 
	 * @throws SchedulerException
	 */
	public void shutdownJobs() throws SchedulerException {
		log.debug("开始执行SchedulerFactory.shutdownJobs(), 开始关闭所有定时任务");
		Scheduler scheduler = schedulerFactoryBean.getScheduler();
		if (!scheduler.isShutdown()) {
			scheduler.shutdown();
		}
	}

}
