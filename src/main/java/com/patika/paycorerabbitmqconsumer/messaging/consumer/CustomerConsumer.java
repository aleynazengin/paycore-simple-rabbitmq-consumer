package com.patika.paycorerabbitmqconsumer.messaging.consumer;

import com.patika.paycorerabbitmqconsumer.config.RabbitMQConfig;
import com.patika.paycorerabbitmqconsumer.model.Customer;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class CustomerConsumer {
    @RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void consumeMessageFromQueue(Customer customer) {
        System.out.println("Customer message received & consumed from queue : " + customer);
    }
}
