package com.example.cyclemetal.models.user

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID

//User Model to store information from the backend
data class User(
    val id: UUID,
    val email: String,
    val username: String,
    val role: String,
    val dateJoined: LocalDateTime,
    val phoneNumber: Int,
    val code: String,
    val hasActiveRoute: Boolean? = null,
    val vehicle: String? = null,
){
    fun getDateJoinedFormat(): String {
        return dateJoined.format(DateTimeFormatter.ISO_LOCAL_DATE)
    }
}