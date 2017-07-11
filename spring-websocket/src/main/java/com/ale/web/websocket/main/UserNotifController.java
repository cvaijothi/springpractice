package com.ale.web.websocket.main;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.ale.web.websocket.enity.UserMessage;

@Controller
public class UserNotifController {

    @MessageMapping("/notification")
    @SendTo("/userbroker/notif")
    public UserMessage notiyOperation(UserMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        return message;
    }

}
