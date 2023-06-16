package tech.Matheus.Credit.RequestSystem.dto

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import org.hibernate.validator.constraints.br.CPF
import tech.Matheus.Credit.RequestSystem.entity.Address
import tech.Matheus.Credit.RequestSystem.entity.Customer
import java.math.BigDecimal

data class CustomerDto(
   @field:NotEmpty(message = "Type it your name!") val firstName: String,
   @field:NotEmpty(message = "Type it your last name!") val lastName: String,
   @field:CPF(message = "This is invalid CPF!") val cpf: String,
   @field:NotNull(message = "Type it your income!") val income: BigDecimal,
   @field:Email(message = "Invalid email!") val email: String,
   @field:NotEmpty(message = "Choose a password !") val password: String,
   @field:NotEmpty(message = "Type it your zip code!") val zipCode: String,
   @field:NotEmpty(message = "Type it your street!") val street: String,
   @field:NotNull(message = "Type it your house number!") val number: Int
) {
    fun toEntity(): Customer = Customer(
        firstName = this.firstName,
        lastName = this.lastName,
        cpf = this.cpf,
        income = this.income,
        email = this.email,
        password = this.password,
        address = Address(
            zipCode = this.zipCode,
            street = this.street,
            number = this.number
        )
    )
}