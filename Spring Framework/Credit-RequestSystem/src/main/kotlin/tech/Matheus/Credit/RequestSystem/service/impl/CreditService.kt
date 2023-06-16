package tech.Matheus.Credit.RequestSystem.service.impl

import org.springframework.stereotype.Service
import tech.Matheus.Credit.RequestSystem.entity.Credit
import tech.Matheus.Credit.RequestSystem.exception.BusinessException
import tech.Matheus.Credit.RequestSystem.repository.CreditRepository
import tech.Matheus.Credit.RequestSystem.service.ICreditService
import java.util.*

@Service
class CreditService(private val creditRepository: CreditRepository,
                    private val customerService: CustomerService
) : ICreditService {
    override fun save(credit: Credit): Credit {
        credit.apply {
            customer = customerService.findById(credit.customer?.id!!)
        }
        return this.creditRepository.save(credit)
    }

    override fun findAllByCustomer(customerId: Long): List<Credit> =
            this.creditRepository.findAllByCustomerId(customerId)


    override fun findByCreditCode(customerId: Long, creditCode: UUID): Credit {
      val credit: Credit = (this.creditRepository.findByCreditCode(creditCode)
                ?: throw BusinessException("CreditCode $creditCode not found"))
        return if (credit.customer?.id == customerId) credit else throw IllegalArgumentException("Contact admin")
    }
}