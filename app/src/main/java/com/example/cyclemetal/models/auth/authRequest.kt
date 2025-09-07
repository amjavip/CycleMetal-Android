package com.example.cyclemetal.models.auth
import java.time.temporal.Temporal
import java.util.UUID
data class LoginRequest(
    val email: String,
    val username: String,
    val password:String
)
data class RegisterRequest(
    val email: String,
    val username: String,
    val role: String,
){
    fun isSeller():Boolean = role == "seller"
    fun isCollector(): Boolean = role == "collector"
}
data class TokenRequest(
    val refresh: String,
)
data class SendResetEmailRequest(
    val id: UUID,
)
data class SetNewPassword(
    val newPassword: String,
    val id: UUID,
    val temporalToken: String
)