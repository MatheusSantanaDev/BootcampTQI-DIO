package tech.Matheus.Credit.RequestSystem.dto

import tech.Matheus.Credit.RequestSystem.entity.Credit
import java.math.BigDecimal
import java.util.UUID
import tech.Matheus.Credit.RequestSystem.enummeration.Status
data class CreditView(
    val creditCode: UUID,
    val creditValue: BigDecimal,
    val numberOfInstallments: Int,
    val status: Status,
    val emailCustomer: String?,
    val incomeCustomer: BigDecimal?
){
    constructor(credit: Credit): this(
        creditCode = credit.creditCode,
        creditValue = credit.creditValue,
        numberOfInstallments = credit.numberOfInstallments,
        status = credit.status,
        emailCustomer = credit.customer?.email,
        incomeCustomer = credit.customer?.income

    )
}
