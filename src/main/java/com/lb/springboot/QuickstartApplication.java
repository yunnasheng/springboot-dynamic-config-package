package com.lb.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.lb.springboot.config.AppConfig;

@SpringBootApplication
public class QuickstartApplication {
	
	/**
	 * 应用程序入口
	 * @param args
	 */
	public static void main(String[] args) {
		// 启动springboot应用程序
		ConfigurableApplicationContext context = SpringApplication.run(QuickstartApplication.class, args);
		// 测试自定义配置
		AppConfig appConfig = context.getBean(AppConfig.class);
		// 打印日志
		appConfig.output();
	}

}
