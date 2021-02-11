package com.shehani.rentcloud.rentui.controller;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableOAuth2Sso
public class UIController {
    @RequestMapping(value = "/")
    public String loadUI(){
        return "home";
    }
}
