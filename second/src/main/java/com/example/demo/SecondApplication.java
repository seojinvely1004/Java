package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication //xml을 대신하는 java설정 클래스 file임>설정파일+spring tomcat 시작파일
//@ComponentScan//현재패키지를 베이스로 하겠다는 @인데 내장되어있다.(basePackages="com/example.demo") 
//@ComponentScan(basePackages = "추가한패키지명")

@ComponentScan
@ComponentScan(basePackages = "upload")
@ComponentScan(basePackages = "spring.mybatis")//@ComponentScan(basePackageClasses="MemberDTO.dto")와 같다.
@MapperScan(basePackages="spring.mybatis")
@ComponentScan(basePackages = "websocket")
public class SecondApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondApplication.class, args);
	}

}
