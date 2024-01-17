package com.example.todo.domain.todo.service

import com.example.todo.domain.todo.dto.TodoResponse
import com.example.todo.domain.todo.dto.CreateTodoRequest
import com.example.todo.domain.todo.dto.UpdateTodoRequest

interface TodoService {

    fun getAllCardList(): List<TodoResponse>

    fun getCardById (todosId: Long): TodoResponse

    fun createCard (request: CreateTodoRequest): TodoResponse

    fun updateCard (todosId: Long, request: UpdateTodoRequest): TodoResponse

    fun deleteCard (todosId: Long)
}