package tech.Matheus.Credit.RequestSystem.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import tech.Matheus.Credit.RequestSystem.entity.Customer

@Repository
interface CustomerRepository: JpaRepository<Customer, Long>