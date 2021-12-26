package com.example.sqs;

import org.springframework.cloud.aws.messaging.listener.SqsMessageDeletionPolicy;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Consumer {
    @SqsListener(value = "notifications.fifo",deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
    public void processMessage(Data message) {
        log.info("Message from SQS {}", message);
    }
}
