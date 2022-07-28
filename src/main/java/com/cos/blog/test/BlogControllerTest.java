package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 스프링이 com.cos.blog 패키지 아래 있는 특정 어노테이션이 붙은 파일들을 객체 생성해서
// 메모리에 올리고 스프링 컨테이너가 관리해줌

@RestController
public class BlogControllerTest {
	
	//http://localhost:8080/test/hello
	@GetMapping("/test/hello")
	public String hello() {
		return "hello";
	}
}
