package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class UserInfo {

    @RequestMapping(path = "/userinfo", method = RequestMethod.GET)
    Object userinfo(Authentication authentication) {
        return authentication;
    }
}
