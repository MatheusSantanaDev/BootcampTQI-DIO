package tech.Matheus.Credit.RequestSystem.exception

data class BusinessException(override val message: String?) : RuntimeException(message)