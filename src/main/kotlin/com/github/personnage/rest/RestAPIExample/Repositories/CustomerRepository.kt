package com.github.personnage.rest.RestAPIExample.Repositories

import com.github.personnage.rest.RestAPIExample.Customer
import org.springframework.data.repository.CrudRepository

interface CustomerRepository : CrudRepository<Customer, Long> {
    fun findByLastName(name: String): List<Customer>

    fun deleteByLastName(name: String) {
        val customer: Customer = this.findByLastName(name).first()
        this.delete(customer)
    }
}