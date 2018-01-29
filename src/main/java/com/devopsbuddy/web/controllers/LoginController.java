package com.devopsbuddy.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.xml.ws.RequestWrapper;

@Controller
public class LoginController {

    /** The login view name */
     public static final String LOGIN_VIEW_NAME = "user/login";

     @GetMapping("/login")
     public String login() {
         return LOGIN_VIEW_NAME;
     }
}
