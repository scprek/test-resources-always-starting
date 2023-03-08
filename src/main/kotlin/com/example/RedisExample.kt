package com.example

import io.micronaut.cache.annotation.Cacheable
import jakarta.inject.Singleton

@Singleton
open class RedisExample() {
    @Cacheable(cacheNames = ["test"])
    open fun getValue(value: Int): Int {
        return value
    }
}
