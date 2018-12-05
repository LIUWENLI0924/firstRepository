package com.cssl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan("com.cssl.dao")
@EnableTransactionManagement
@SpringBootApplication
public class DemoApp {

	public static void main(String[] args) {
		
		SpringApplication.run(DemoApp.class, args);
		
		//SpringApplication app = new SpringApplication(DemoApp.class);
		//app.setBannerMode(Banner.Mode.OFF);
		//app.run(args);

	}

}
