package com.example.finalproj.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@RestController
@Controller
public class MyController {

    @RequestMapping("/test")
    public String test(){
        return "test";
    }

    @RequestMapping("/wordcloud")
    public String wordcloud(){
        return "wordcloud";
    }

    @RequestMapping("/ratingpie")
    public String allratingcompare(){
        return "allratingcompare";
    }

    @RequestMapping("/ratingscatter")
    public String allratingscatter(){
        return "allratingscatter";
    }

    @RequestMapping("/oneratingcompare")
    public String oneratingcompare(){
        return "oneratingcompare";
    }

    @RequestMapping("/top250")
    public String top250rating(){
        return "top250rating";
    }

    @RequestMapping("/ratingbar")
    public String ratingbar(){
        return "comparebymovietype";
    }

    @RequestMapping("/result")
    public String result(){
        return "components";
    }

}
