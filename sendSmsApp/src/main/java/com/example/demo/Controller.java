package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
@RequestMapping("smsApp")
public class Controller {
    private final Services services;

    @Autowired
    public Controller(Services services) {
        this.services = services;
    }
    @PostMapping("send")
    public void sendSms(@Valid @RequestBody SMS smsRequest) {
        services.sendSms(smsRequest);
    }
}