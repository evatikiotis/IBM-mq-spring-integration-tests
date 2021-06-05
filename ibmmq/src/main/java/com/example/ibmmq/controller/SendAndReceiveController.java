package com.example.ibmmq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.JmsException;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendAndReceiveController {

    private final JmsTemplate jmsTemplate;

    @Autowired
    public SendAndReceiveController(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @GetMapping("send")
    String send() {
        try {
            jmsTemplate.convertAndSend("DEV.QUEUE.1", "Hello World!");
            return "OK";
        } catch (JmsException ex) {
            ex.printStackTrace();
            return "FAIL";
        }
    }

    @GetMapping("recv")
    String recv() {
        try {
            return jmsTemplate.receiveAndConvert("DEV.QUEUE.1").toString();
        } catch (JmsException ex) {
            ex.printStackTrace();
            return "FAIL";
        }
    }
}
