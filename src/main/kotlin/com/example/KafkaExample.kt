package com.example

import io.micronaut.configuration.kafka.annotation.KafkaListener
import io.micronaut.configuration.kafka.annotation.Topic

@KafkaListener(groupId = "test-group")
open class KafkaExample() {
    @Topic("\${kafka.consumers.test.topic}")
    open fun receive(event: Any) {
        return
    }
}
