package com.jobs.controller.base;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class BaseController {
    @Value("${spring.profiles.active}")
    String env;

    /**
     * qian zhi cao zuo,ba zhi chuan dao suo you ye mian
     *
     * @param model
     */
    @ModelAttribute
    public void before(Model model) {
        model.addAttribute("env", env);
    }
}