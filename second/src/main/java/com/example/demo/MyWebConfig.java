package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
@Configuration//설정파일
@EnableWebSocket//
public class MyWebConfig implements WebMvcConfigurer {
//sts3에선 <resources mapping="/upload/**" location="file:///c:/upload/"/>
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/upload/**").addResourceLocations("file:///c:/upload/");
	//jsp에서 websocket = new WebSocket("ws://localhost:8086/ws");
	}

}
