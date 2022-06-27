package com.play.demo.data.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/test")
public class DataController {
	@Value("${myStr:}")
	private String addr;

	@GetMapping("/test")
	public String list(){
		return "addr";
	}

}
