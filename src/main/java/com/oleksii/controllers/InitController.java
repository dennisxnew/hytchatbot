package com.oleksii.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dennis.Chen
 * @Date
 */
@RestController
public class InitController {

    @RequestMapping("")
    public String init(){
        return "Init Success";
    }
}
