package com.github.personnage.rest.RestAPIExample.Http.Controllers

import com.github.personnage.rest.RestAPIExample.Customer

import com.github.personnage.rest.RestAPIExample.Repositories.CustomerRepository
import org.springframework.web.bind.annotation.*

@RestController
class CustomerController (val repository: CustomerRepository) {

    @GetMapping("/")
    fun index(): Iterable<Customer> = repository.findAll()

    @GetMapping("/{id}")
    fun show(@PathVariable id:Long): Customer? = repository.findOne(id)

//    @GetMapping("/{name}")
//    fun showByName(@PathVariable name:String) = repository.findByLastName(name)

    @PostMapping()
    fun save(@RequestBody input:Customer): Customer = repository.save(input)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id:Long) = repository.delete(id)
}