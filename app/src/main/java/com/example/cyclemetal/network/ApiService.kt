package com.example.cyclemetal.network
import okhttp3.Request
import java.io.IOException;
import java.util.List;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body
import retrofit2.http.GET;
import retrofit2.http.POST
import retrofit2.http.Path;
interface ApiService {
@POST("/users/api/login/")
suspend fun login(@Body request: LoginRequest): AuthResponse
}