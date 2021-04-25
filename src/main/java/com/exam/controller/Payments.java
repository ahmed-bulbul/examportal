package com.exam.controller;

import com.exam.sslcommerz.SSLCommerz;

import com.exam.sslcommerz.Utility.ParameterBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/")
public class Payments{

    @GetMapping("test")
     public ResponseEntity<?> test(){

        ParameterBuilder.constructRequestParameters();
        return ResponseEntity.ok("ok");
    }

}
