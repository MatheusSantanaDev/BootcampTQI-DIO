package tech.Matheus.Credit.RequestSystem.service.impl

import org.springframework.stereotype.Service
import tech.Matheus.Credit.RequestSystem.entity.Customer
import tech.Matheus.Credit.RequestSystem.exception.BusinessException
import tech.Matheus.Credit.RequestSystem.repository.CustomerRepository
import tech.Matheus.Credit.RequestSystem.service.ICustomerService

@Service
class CustomerService(private val customerRepository: CustomerRepository) : ICustomerService {
    override fun save(customer: Customer): Customer = this.customerRepository.save(customer)
    override fun findById(id: Long): Customer = this.customerRepository.findById(id)
        .orElseThrow{throw BusinessException("Id $id not found") }

    override fun delete(id: Long) {
       val customer: Customer = this.findById(id)
       this.customerRepository.delete(customer)
    }
}