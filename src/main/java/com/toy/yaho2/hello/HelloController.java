package com.toy.yaho2.hello;

import com.toy.yaho2.yaho.YahoClient;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/hello")
@CrossOrigin
public class HelloController {

    private final YahoClient yahoClient;

    public HelloController(YahoClient yahoClient) {
        this.yahoClient = yahoClient;
    }

    @GetMapping("/{name}")
    public String hello(@PathVariable String name) {
        return "Hello yaho2 " + name;
    }

    @PatchMapping("/{name}")
    public String hello2(@PathVariable String name) {
        return "Hello2 yaho2 " + name;
    }

    @GetMapping("/test")
    public String test() {
        return yahoClient.getTest();
    }

    @GetMapping("/test2")
    public String test2() {
        return yahoClient.getTestName("종찬짱");
    }
}
