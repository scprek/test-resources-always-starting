package com.example

import io.micronaut.runtime.Micronaut

object Application {
	@JvmStatic
	fun main(args: Array<String>) {
		Micronaut.build()
			.eagerInitSingletons(true)
			.eagerInitConfiguration(true)
			.mainClass(Application.javaClass)
			.start()
	}
}

