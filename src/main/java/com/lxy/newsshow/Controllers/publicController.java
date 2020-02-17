package com.lxy.newsshow.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class publicController {
    @GetMapping(value = "/main")
    public String GetMain(){
        return "public/main";
    }

}
