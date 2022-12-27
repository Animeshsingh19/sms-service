package com.example.smsservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SmsSend {

    @GetMapping("/get/sms")
    public String index(){

        return "Msg send succesfully";
    }
}
