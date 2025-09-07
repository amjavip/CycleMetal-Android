package com.example.cyclemetal.models.auth

import com.example.cyclemetal.models.user.User


data class authResponse(
    val refresh: String,
    val token: String,
    val user: User
)
data class ApiResponse(
    val message: String,
    val success: Boolean,
)
