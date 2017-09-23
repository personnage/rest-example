package com.github.personnage.rest.RestAPIExample

import com.github.personnage.rest.RestAPIExample.Repositories.CustomerRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class RestApiExampleApplication {
    @Bean
    fun init(repository: CustomerRepository) = CommandLineRunner {
        repository.save(Customer("Jack", "Bauer"))
        repository.save(Customer("Chloe", "O'Brian"))
        repository.save(Customer("Kim", "Bauer"))
        repository.save(Customer("David", "Palmer"))
        repository.save(Customer("Michelle", "Dessler"))
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(RestApiExampleApplication::class.java, *args)
}
