package com.example.dtxeyelogin2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication
public class DtxEyeLogin2Application {

//	@Bean
//	public BCryptPasswordEncoder encoder(){
//		return new BCryptPasswordEncoder();
//	}

	public static void main(String[] args) {
		SpringApplication.run(DtxEyeLogin2Application.class, args);
	}

}
