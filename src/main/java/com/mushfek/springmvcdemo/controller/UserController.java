package com.mushfek.springmvcdemo.controller;

import com.mushfek.springmvcdemo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Mushfekur Rahman
 * @since 1.0
 */
@Controller
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String firstPage(ModelMap model) {
        log.debug("firstPage: at home");

        model.addAttribute("msg", "Hello World!");

        return "home";
    }
}
