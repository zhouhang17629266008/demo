package com.play.demo.api.controller;


import com.play.demo.api.feign.DataFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/test")
public class CouponController {
	@Value("${work.address:}")
	private String addr;
	@Autowired
	private DataFeignClient dataCollectFeignClient;
	@GetMapping("/test")
	public String list(){
		String a = dataCollectFeignClient.list();
		return a;
	}

}
