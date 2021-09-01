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

    @GetMapping("/Tashira")
    public String stage4() {
        System.out.println(" ***************************** ");
        System.out.println(" Entered To Stage 4  :  TEAM 1  ");
        System.out.println(" ***************************** ");
        return "team1/team1_stage_4.html";
    }
    @GetMapping("/Shanilka")
    public String stage5() {
        System.out.println(" ***************************** ");
        System.out.println(" Entered To Stage 5  :  TEAM 1  ");
        System.out.println(" ***************************** ");
        return "team1/team1_stage_5.html";
    }

    @GetMapping("/Rome=Hasantha")
    public String stage6() {
        System.out.println(" ***************************** ");
        System.out.println(" Entered To Stage 6  :  TEAM 1  ");
        System.out.println(" ***************************** ");
        return "team1/team1_stage_6.html";
    }

    @GetMapping("/Titanic")
    public String stage7() {
        System.out.println(" ***************************** ");
        System.out.println(" Entered To Stage 7  :  TEAM 1  ");
        System.out.println(" ***************************** ");
        return "team1/team1_stage_7.html";
    }

    @GetMapping("/EWR")
    public String stage8() {
        System.out.println(" ***************************** ");
        System.out.println(" Entered To Stage 8  :  TEAM 1  ");
        System.out.println(" ***************************** ");
        return "team1/team1_stage_8.html";
    }

    @GetMapping("/UA 90")
    public String stage9() {
        System.out.println(" ***************************** ");
        System.out.println(" Entered To Stage 9  :  TEAM 1  ");
        System.out.println(" ***************************** ");
        return "team1/team1_stage_9.html";
    }

    @GetMapping("/Tharindu")
    public String stage10() {
        System.out.println(" ***************************** ");
        System.out.println(" Entered To Stage 10  :  TEAM 1  ");
        System.out.println(" ***************************** ");
        return "team2/team1_stage_10.html";
    }




}
