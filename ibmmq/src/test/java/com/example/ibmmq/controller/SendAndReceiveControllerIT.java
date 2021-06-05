package com.example.ibmmq.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SendAndReceiveControllerIT {

    @Autowired
    private SendAndReceiveController sendAndReceiveController;

    @Test
    void test_sendAndReceive() {

        assertEquals("OK", sendAndReceiveController.send());
    }

}
