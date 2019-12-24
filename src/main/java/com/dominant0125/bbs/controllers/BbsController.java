package com.dominant0125.bbs.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BbsController {

//    @RequestMapping("/")
//    public String BbsRoot() throws Exception{
//        return "static/index.html";
//    }

    @RequestMapping("/demo")
    public String BbsRootDemo() throws Exception{
        return "Bbs Root Demo(/demo)";
    }

}
