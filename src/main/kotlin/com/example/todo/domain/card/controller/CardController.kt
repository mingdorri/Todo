package com.example.todo.domain.card.controller

import com.example.todo.domain.card.dto.CardResponse
import com.example.todo.domain.card.dto.CreateCardRequest
import com.example.todo.domain.card.dto.UpdateCardRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/todos")
@RestController
class CardController {

    @GetMapping
    fun getCardList(): ResponseEntity<List<CardResponse>> {
        TODO()
    }

    @GetMapping("/{todosId}")
    fun getCard(@PathVariable todosId: Long
    ): ResponseEntity<CardResponse> {
        TODO()
    }

    @PostMapping
    fun createCard(
        @RequestBody createCardRequest: CreateCardRequest
    ): ResponseEntity<CardResponse> {
        TODO()
    }

    @PutMapping("/{todosId}")
    fun updateCard(
        @PathVariable todosId: Long,
        @RequestBody updateCardRequest: UpdateCardRequest
    ): ResponseEntity<CardResponse> {
        TODO()
    }

    @DeleteMapping("/{todosId}")
    fun deleteCard(@PathVariable todosId: Long){
        TODO()
    }

}