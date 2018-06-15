package com.activemq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
public class SpringHellWorldApplication {
 public static void main(String args[]){
	 ApplicationContext ctx = SpringApplication.run(SpringHellWorldApplication.class, args);
	 JmsTemplate jms = ctx.getBean(JmsTemplate.class);
		jms.convertAndSend("Welcome ActiveMQ", "test message");
 }
}
