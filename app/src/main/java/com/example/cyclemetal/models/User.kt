package com.example.cyclemetal.models
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
data class User(
    val id: UUID,
    val email: String,
    val username: String,
    val dateJoined: LocalDateTime,
    val phoneNumber: Int,
    val code: String? = null,
    val hasActiveRoute: Boolean,
    val vehicle: String? = null,
){
    fun getDateJoinedFormat(): String {
        return dateJoined.format(DateTimeFormatter.ISO_LOCAL_DATE)
    }
}
