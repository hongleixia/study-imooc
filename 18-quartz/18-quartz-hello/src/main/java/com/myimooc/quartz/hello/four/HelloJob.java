package com.myimooc.quartz.hello.four;

import org.quartz.Job;
import org.quartz.JobExecutionContext;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleTrigger 演示
 *
 * @author zc 2017-06-26
 */
public class HelloJob implements Job {

    @Override
    public void execute(JobExecutionContext context) {
        // 打印当前的执行时间，格式为2017-01-01 00:00:00
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Current Exec Time Is : " + sf.format(date));

        System.out.println("Hello World!");
    }
}
