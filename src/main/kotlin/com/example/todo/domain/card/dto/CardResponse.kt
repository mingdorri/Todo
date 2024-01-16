package com.example.todo.domain.card.dto

data class CardResponse(
    val id: Long,
    val title: String,
    val content: String,
    val name: String,
    val createAt: String
)


