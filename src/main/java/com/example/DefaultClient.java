package com.example;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaClient
public interface DefaultClient {

    @Topic(WordCountStream.NAMED_WORD_COUNT_INPUT)
    void publishSentence(String sentence);
}
