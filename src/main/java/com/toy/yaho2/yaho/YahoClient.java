package com.toy.yaho2.yaho;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "yaho")
public interface YahoClient {

    @GetMapping("/test")
    String getTest();

    @GetMapping("/test2/{name}")
    String getTestName(@PathVariable String name);

}
