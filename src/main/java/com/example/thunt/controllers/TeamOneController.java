package com.example.thunt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/team1",method = RequestMethod.GET)
public class TeamOneController {

    @GetMapping("/test")
    public String test(){
        return "test.html";
    }

    @GetMapping("/start")
    public String stage1(){
        System.out.println(" ***************************** ");
        System.out.println(" Entered To Stage 1  :  TEAM 1  ");
        System.out.println(" ***************************** ");
        return "team1/team1_stage_1.html";
    }

    @GetMapping("/2019-01-25T00:00:00.000Z")
    public String stage2(){
        System.out.println(" ***************************** ");
        System.out.println(" Entered To Stage 2  :  TEAM 1  ");
        System.out.println(" ***************************** ");
        return "team1/team1_stage_2.html";
    }

    @GetMapping("/97km")
    public String stage3(){
        System.out.println(" ***************************** ");
        System.out.println(" Entered To Stage 3  :  TEAM 1  ");
        System.out.println(" ***************************** ");
        return "team1/team1_stage_3.html";
    }

}