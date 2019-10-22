package com.pintu.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
@RestController
public class RedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisApplication.class, args);
	}

	@GetMapping("/app")
	public void getSomeValue(HttpServletRequest request){
		System.out.println(null == request.getSession().getAttribute("name") ? "no session value" : request.getSession().getAttribute("name"));
		request.getSession().setAttribute("name", "ravi");
	}

}
