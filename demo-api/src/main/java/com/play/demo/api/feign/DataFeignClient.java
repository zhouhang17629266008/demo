package com.play.demo.api.feign;

import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "demo-data", path = "/test")
public interface DataFeignClient {
    @ApiOperation(value = "获取指定的收藏门店")
    @GetMapping("/test")
    String list();

}
