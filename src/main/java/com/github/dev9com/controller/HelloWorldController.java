package com.github.dev9com.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
public class HelloWorldController {

    @RequestMapping(value = "/hello/{name}", produces = MediaType.APPLICATION_JSON_VALUE, method= RequestMethod.GET)
    public Map<String, Object> sayHello(@PathVariable String name) {
        Map<String, Object> value = new HashMap<>();
        value.put("hello", name);
        return value;
    }
}
