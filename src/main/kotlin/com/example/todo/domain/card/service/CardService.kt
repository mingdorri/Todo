package com.example.todo.domain.card.service

import com.example.todo.domain.card.dto.CardResponse
import com.example.todo.domain.card.dto.CreateCardRequest
import com.example.todo.domain.card.dto.UpdateCardRequest

interface CardService {

    fun getAllCardList(): List<CardResponse>

    fun getCardById (todosId: Long): CardResponse

    fun createCard (request: CreateCardRequest): CardResponse

    fun updateCard (todosId: Long, request: UpdateCardRequest): CardResponse

    fun deleteCard (todosId: Long)
}