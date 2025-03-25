package com.artifact_test.demo.controller;

import com.cherrywork.oneapp.fieldcatalog.controller.LapiController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Test {

    @GetMapping("/api")
    public String TestApi() {
        return "Test API";
    }

//    @GetMapping("/api2")
//    public String TestApi2() {
//        LapiController.findAllDestinations();
//    }




}
