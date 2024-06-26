package com.example;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaClient
public interface WordCountClient {

    @Topic(WordCountStream.INPUT)
    void publishSentence(String sentence);
}
