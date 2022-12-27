package com.example.smsservice;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SmsController {

    @GetMapping("/send/sms")
    public String index(){
         String ACCOUNT_SID = "AC88b9d28faa2d5b0f43e4d464af4c5c11";
        String AUTH_TOKEN = "c775f523053234c30fc63af65bdc0041";
            Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
            Message message = Message.creator(
                            new PhoneNumber("+918318849167"),
                            new PhoneNumber("+16693056222"),
                            "Hi this side animesh from twilio")
                    .create();

            System.out.println(message.getSid());

        return "Hello lucky";
    }

    @GetMapping("/msg")
    public String print(){
        return "hello";
    }
}
