package com.example.cyclemetal.models.order

import java.time.LocalDateTime
import java.util.UUID

//Order model to store data from the backend
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