package tech.Matheus.Credit.RequestSystem.dto

import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import tech.Matheus.Credit.RequestSystem.entity.Customer
import java.math.BigDecimal

data class CustomerUpdateDto(
    @field:NotEmpty(message = "Type it your name!") val firstName: String,
    @field:NotEmpty(message = "Type it your last name!") val lastName: String,
    @field:NotNull(message = "Type it your income!") val income: BigDecimal,
    @field:NotEmpty(message = "Type it your zip code!") val zipCode: String,
    @field:NotEmpty(message = "Type it your street!") val street: String,
    @field:NotEmpty(message = "Type it your house number!") val number: Int
) {
    fun toEntity(customer: Customer): Customer {
        customer.firstName = this.firstName;
        customer.lastName = this.lastName;
        customer.income = this.income;
        customer.address.zipCode = this.zipCode;
        customer.address.street = this.street;
        customer.address.number = this.number
        return customer
    }
}