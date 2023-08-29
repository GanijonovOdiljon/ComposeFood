package com.example.jatpackcomposefoot.ui.theme.food_list

import com.example.jatpackcomposefoot.model.Category

data class MainState(
    val loading: Boolean = false,
    val error: String = "",
    val success: List<Category> = emptyList()
)