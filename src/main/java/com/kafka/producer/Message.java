package com.kafka.producer;

import java.util.Date;

import lombok.Data;

@Data
public class Message {

    private String id;
    private String msg;
    private Date sendTime;
    
}
