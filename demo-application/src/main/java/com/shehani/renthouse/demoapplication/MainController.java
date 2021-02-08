package com.shehani.renthouse.demoapplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String greeting1() {
        return "Hello SpringBoot from get";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String greeting2() {
        return "Hello SpringBoot from POST";
    }
}
