package com.boot.simple;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dmytro Honchar
 * Date: 7/14/2022
 */

@RestController
public class WebController {

    @GetMapping("/")
    public String index(){
        return "Hello Spring Boot!!";
    }

}