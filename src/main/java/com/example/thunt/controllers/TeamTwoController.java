package com.example.thunt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/team2",method = RequestMethod.GET)
public class TeamTwoController {

    @GetMapping("/test")
    public String test(){
        return "test.html";
    }

    @GetMapping("/start")
    public String stage1(){
            return "team2/team2_stage_1.html";
        }

        @GetMapping("/2010-05-20T00:00:00.000Z")
        public String stage2(){
            return "team2/team2_stage_1.html";
        }




}
