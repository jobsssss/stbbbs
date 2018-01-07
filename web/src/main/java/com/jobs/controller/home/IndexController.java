package com.jobs.controller.home;

import com.jobs.controller.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController extends BaseController{
    @RequestMapping("/")
    public String index() {
        return "home/index";
    }
}
