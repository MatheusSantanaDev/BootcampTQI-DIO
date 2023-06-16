package tech.Matheus.Credit.RequestSystem.dto

import jakarta.validation.constraints.Future
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import tech.Matheus.Credit.RequestSystem.entity.Credit
import tech.Matheus.Credit.RequestSystem.entity.Customer
import java.math.BigDecimal
import java.time.LocalDate

data class CreditDto (
    @field:NotNull(message = "Invalid input!") val creditValue: BigDecimal,
    @field:Future val dayFirstOfInstallment: LocalDate,
    @field:Min(value = 1) @field:Max(value = 12) val numberOfInstallments: Int,
    @field:NotNull(message = "Invalid ID!") val customerId: Long
){

    fun toEntity(): Credit = Credit(
        creditValue = this.creditValue,
        dayFirstInstallment = this.dayFirstOfInstallment,
        numberOfInstallments = this.numberOfInstallments,
        customer = Customer(id = this.customerId)
    )
}