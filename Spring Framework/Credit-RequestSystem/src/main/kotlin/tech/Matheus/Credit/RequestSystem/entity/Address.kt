package tech.Matheus.Credit.RequestSystem.entity

import jakarta.persistence.Column
import jakarta.persistence.Embeddable

@Embeddable
data class Address (
        @Column(nullable = false) var zipCode: String = "",
        @Column(nullable = false) var street: String = "",
        @Column(nullable = false) var number: Int = 0
)
