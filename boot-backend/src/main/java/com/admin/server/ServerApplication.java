package com.admin.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.WebApplicationInitializer;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 启动类
 * 
 * @author 小威老师 xiaoweijiagou@163.com
 *
 *         2017年4月18日
 */

@SpringBootApplication
public class ServerApplication extends SpringBootServletInitializer implements WebApplicationInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}


	/*protected SpringApplicationBuilder configure(SpringApplicationBuilder application){

		return application.sources(ServerApplication.class);
	}*/
}
