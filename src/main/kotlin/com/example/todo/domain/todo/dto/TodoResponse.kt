package com.example.todo.domain.todo.dto

data class TodoResponse(
    val id: Long,
    val title: String,
    val content: String,
    val name: String,
    val createAt: String
)


