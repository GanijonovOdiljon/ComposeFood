package com.example.jatpackcomposefoot.network

import com.example.jatpackcomposefoot.model.FoodResponce
import retrofit2.Response
import retrofit2.http.GET

interface FoodService {
    @GET("categories.php")
    suspend fun getFoods(): Response<FoodResponce>
}