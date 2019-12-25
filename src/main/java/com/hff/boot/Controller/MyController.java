package com.hff.boot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther hff
 * @time 2019/12/25 - 10:39
 **/
@RestController
public class MyController {

    @RequestMapping("info")
    public String controller(){
        return "snvisjiv";
    }
}
