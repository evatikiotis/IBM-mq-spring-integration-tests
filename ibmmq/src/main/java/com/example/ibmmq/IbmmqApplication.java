package com.example.ibmmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@EnableJms
@SpringBootApplication
public class IbmmqApplication {

    public static void main(String[] args) {
        SpringApplication.run(IbmmqApplication.class, args);
    }

//    @Bean
//    public Connection mqConnection() throws MalformedURLException, JMSException {
//        MQQueueConnectionFactory mqQueueConnectionFactory = new MQQueueConnectionFactory();
//        java.net.URL ccdt = new URL("file:///Users/evangelosvatikiotis/Documents/workspace/private_space/gs-messaging-jms/ibmmq/src/main/resources/AMQCLCHL.TAB");
//        mqQueueConnectionFactory.setIntProperty(CommonConstants.WMQ_CONNECTION_MODE, CommonConstants.WMQ_CM_CLIENT);
//
//        mqQueueConnectionFactory.setChannel("DEV.ADMIN.SVRCONN");
//        mqQueueConnectionFactory.setQueueManager("QM1");
//        mqQueueConnectionFactory.setConnectionNameList("localhost(1414)");
//        return mqQueueConnectionFactory.createConnection(username, password);
//    }
}
