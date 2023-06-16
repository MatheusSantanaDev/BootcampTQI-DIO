package tech.Matheus.Credit.RequestSystem.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import tech.Matheus.Credit.RequestSystem.enummeration.Status
import java.math.BigDecimal
import java.time.LocalDate
import java.util.UUID

@Entity
data class Credit (
        @Column(nullable = false, unique = true) val creditCode: UUID = UUID.randomUUID(),
        @Column(nullable = false) val creditValue:BigDecimal = BigDecimal.ZERO,
        @Column(nullable = false) val dayFirstInstallment: LocalDate,
        @Column(nullable = false) val numberOfInstallments: Int = 0,
        @Enumerated val status: Status = Status.IN_PROGRESS,
        @ManyToOne var customer: Customer? = null,
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null
)