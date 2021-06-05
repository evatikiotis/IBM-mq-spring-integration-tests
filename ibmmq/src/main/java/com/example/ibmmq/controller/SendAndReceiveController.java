package com.example.ibmmq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.JmsException;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendAndReceiveController {

    private final JmsTemplate jmsTemplate;

    @Value("${ibm.mq.queue-name}")
    private String queueName;

    @Autowired
    public SendAndReceiveController(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @GetMapping("send")
    String send() {
        try {
            jmsTemplate.convertAndSend(queueName, "Hello World!");
            return "OK";
        } catch (JmsException ex) {
            ex.printStackTrace();
            return "FAIL";
        }
    }

    @GetMapping("recv")
    String recv() {
        try {
            return jmsTemplate.receiveAndConvert(queueName).toString();
        } catch (JmsException ex) {
            ex.printStackTrace();
            return "FAIL";
        }
    }
}
