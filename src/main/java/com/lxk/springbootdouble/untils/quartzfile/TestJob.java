package com.lxk.springbootdouble.untils.quartzfile;

import org.quartz.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

@Configuration
@Component
@EnableScheduling
public class TestJob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
            //获取定时任务名，分组，类包
            JobKey key = jobExecutionContext.getJobDetail().getKey();
            //获取定时配置传的参数
            JobDataMap jobDataMap = jobExecutionContext.getJobDetail().getJobDataMap();
            System.out.println("--------Group: " + key.getGroup());
            System.out.println("--------Name: " + key.getName());
            System.out.println("--------Class: " + key.getClass());
            System.out.println("--------interiorApiSign: " + jobDataMap.getString("interiorApiSign"));
    }
}
