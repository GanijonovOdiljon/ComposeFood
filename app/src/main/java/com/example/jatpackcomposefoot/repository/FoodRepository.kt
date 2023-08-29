package com.example.jatpackcomposefoot.repository

import com.example.jatpackcomposefoot.network.FoodService

class FoodRepository(
    private val foodService: FoodService
) {
    suspend fun getFoods() = foodService.getFoods()
}