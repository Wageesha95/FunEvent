package com.example.thunt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/Thashira")
    public String stage4() {
        System.out.println(" ***************************** ");
        System.out.println(" Entered To Stage 4  :  TEAM 1  ");
        System.out.println(" ***************************** ");
        return "team1/team1_stage_4.html";
    }
    @GetMapping("/Mihiru")
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

    @GetMapping("/41°43′32″N 49°56′49″W")
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
        return "team1/team1_stage_10.html";
    }

    @GetMapping("/Los Angeles")
    public String stage11() {
        System.out.println(" ***************************** ");
        System.out.println(" Entered To Stage 11  :  TEAM 1  ");
        System.out.println(" ***************************** ");
        return "team1/team1_stage_11.html";
    }

    @GetMapping("/Lakmini")
    public String stage12() {
        System.out.println(" ***************************** ");
        System.out.println(" Entered To Stage 12  :  TEAM 1  ");
        System.out.println(" ***************************** ");
        return "team1/team1_stage_12.html";
    }

    @GetMapping("/Y")
    public String stage13() {
        System.out.println(" ***************************** ");
        System.out.println(" Entered To Stage 13  :  TEAM 1  ");
        System.out.println(" ***************************** ");
        return "team1/team1_stage_13.html";
    }

    @GetMapping("/UA 8022")
    public String stage14() {
        System.out.println(" ***************************** ");
        System.out.println(" Entered To Stage 14  :  TEAM 1  ");
        System.out.println(" ***************************** ");
        return "team2/team2_stage_14.html";
    }

    @GetMapping("/Kleinburg")
    public String stage15() {
        System.out.println(" ***************************** ");
        System.out.println(" Entered To Stage 15  :  TEAM 1  ");
        System.out.println(" ***************************** ");
        return "team1/team1_stage_15.html";
    }

    @GetMapping("/2")
    public String stage16() {
        System.out.println(" ***************************** ");
        System.out.println(" Entered To Stage 16  :  TEAM 2  ");
        System.out.println(" ***************************** ");
        return "team1/team1_stage_16.html";
    }

    @GetMapping("/40.4440°N 3.6935°W")
    public String stage17() {
        System.out.println(" ***************************** ");
        System.out.println(" Entered To Stage 17  :  TEAM 2  ");
        System.out.println(" ***************************** ");
        return "team1/team1_stage_17.html";
    }

    @GetMapping("/safe")
    public String stage18() {
        System.out.println(" ***************************** ");
        System.out.println(" Entered To Stage 18  :  TEAM 2  ");
        System.out.println(" ***************************** ");
        return "team1/team1_stage_18.html";
    }

    @GetMapping("/passcode")
    public String stage19(@RequestParam(required = false) String A, String B, String C, String D, String E, String F, String G) {
        if (A != null && B != null && C != null && D != null && E != null && F != null && G != null) {
            if (A.equals("067")  && B.equals("101") && C.equals("112")  && D.equals("104")  && E.equals("101")  && F.equals("117")  && G.equals("115")) {
                System.out.println(" ***************************** ");
                System.out.println(" Game END  ");
                System.out.println(" ***************************** ");
                return "team1/team1_stage_19.html";
            } else {
                System.out.println(" ***************************** ");
                System.out.println(" Wrong Pass Code  ");
                System.out.println(" ***************************** ");
                return "team1/team1_stage_18.html";
            }
        }
        System.out.println(" ***************************** ");
        System.out.println(" Wrong Pass Code  ");
        System.out.println(" ***************************** ");
        return "team1/team1_stage_18.html";
    }







}





