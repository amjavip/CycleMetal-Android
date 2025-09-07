package com.example.cyclemetal.models

import java.time.LocalDateTime
import java.util.UUID

data class Order(
    val id: UUID,
    val idSeller: UUID,
    val idCollector: UUID,
    val orderCreationDay: LocalDateTime,
    val status: String,
    val subtotal: Float,
    val commission: Float,
    val tip: Float,
    val total: Float,
    val lat: Float,
    val lon: Float,
    val paymentMethod: UUID,
)
