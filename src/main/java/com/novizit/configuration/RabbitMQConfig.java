package com.novizit.configuration;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
    public static final String OFFLINE_QUEUE_PREFIX = "offline_user_";
    public static final String EXCHANGE_NAME = "chat_direct_exchange";

    @Bean
    public Queue offlineUserQueue() {
        return new Queue(OFFLINE_QUEUE_PREFIX + "#{userId}");
    }

    @Bean
    public DirectExchange chatDirectExchange() {
        return new DirectExchange(EXCHANGE_NAME);
    }

    @Bean
    public Binding offlineUserBinding(Queue offlineUserQueue, DirectExchange chatDirectExchange) {
        return BindingBuilder.bind(offlineUserQueue).to(chatDirectExchange).with("#{userId}");
    }
}
