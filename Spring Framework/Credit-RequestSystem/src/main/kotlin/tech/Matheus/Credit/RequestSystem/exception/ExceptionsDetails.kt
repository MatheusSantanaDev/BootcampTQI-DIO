package tech.Matheus.Credit.RequestSystem.exception

import java.time.LocalDateTime

class ExceptionsDetails (
    val title: String,
    val timestamp: LocalDateTime,
    val status: Int,
    val exception: String,
    val details: MutableMap<String, String?>
)