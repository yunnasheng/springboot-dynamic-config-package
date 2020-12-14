package com.lb.springboot.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;


/**
 * 应用的自定义配置
 * @author lb
 *  <h2>说明</h2>
 *  <p> {@code @Configuration}的作用相当于引入web.xml --> applicationContext-web.xml --> ApplicationConfig.xml </p>
 *  <p> {@code @ComponentScan}的作用相当于applicationContext-web.xml 配置的扫描</p>
 *   <p> {@code @PropertySource}加载自定义的配置</p>
 *   
 */
@Configuration
@ComponentScan(basePackages = {"com.lb.springboot.*"})
@PropertySource("classpath:myconfig.properties")
public class AppConfig{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AppConfig.class);
	
	@Value("${applicationfile.coustom.testname}")
	private String coustomName;

	@Value("${coustomfile.username}")
	private String username;
	
	@Autowired
	private Environment env;
	
	@Value("${lb.env.dynamic.attr}")
	private String dynamicAttr;
	
	
	public void output() {
		LOGGER.info("使用 @Value 读取到的自定义配置: {}", coustomName);
		LOGGER.info("使用 @Autowired Environment 读取到的自定义配置: {}", env.getProperty("applicationfile.coustom.testname"));
		LOGGER.info("加载自定义配置文件 - username: {},",username);
		LOGGER.info("动态获取pom.xml配置 - dynamicAttr value: {}",dynamicAttr);
		
	}
}
