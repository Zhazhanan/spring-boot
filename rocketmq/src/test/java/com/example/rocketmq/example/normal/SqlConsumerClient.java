package com.example.rocketmq.example.normal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SqlConsumerClient {

    public static void main(String[] args) {

        /**
         * 消费者Bean配置在consumer.xml中,可通过ApplicationContext获取或者直接注入到其他类(比如具体的Controller)中.
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("sql_consumer.xml");
        System.out.println("Consumer Started");
    }
}
