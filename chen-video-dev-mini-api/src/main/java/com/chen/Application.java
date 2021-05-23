package com.chen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages="com.chen.mapper")
@ComponentScan(basePackages= {"com.chen", "org.n3r.idworker"})
public class Application {

	public static void main(String[] args) {
			SpringApplication.run(Application.class, args);
		}

	
}
