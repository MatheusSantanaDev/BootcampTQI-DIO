package tech.Matheus.Credit.RequestSystem.service

import tech.Matheus.Credit.RequestSystem.entity.Customer

interface ICustomerService {
    fun save(customer: Customer): Customer
    fun findById(id: Long): Customer
    fun delete(id: Long)
}