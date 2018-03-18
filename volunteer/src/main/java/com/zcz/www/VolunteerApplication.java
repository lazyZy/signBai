package com.zcz.www;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@ImportResource(locations = {"classpath:spring/spring-all.xml"})
@SpringBootApplication
@EnableSwagger2
public class VolunteerApplication  {

	public static void main(String[] args) {
		SpringApplication.run(VolunteerApplication.class, args);
	}
}
