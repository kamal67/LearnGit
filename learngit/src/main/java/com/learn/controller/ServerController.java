package com.learn.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {


    @GetMapping(value = "/start")
    public ResponseEntity<Object> startServer(){
        return new ResponseEntity<Object>("Started !!!", HttpStatus.OK);
    }

}
