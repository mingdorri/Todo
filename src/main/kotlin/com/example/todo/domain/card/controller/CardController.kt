package com.example.todo.domain.card.controller

import com.example.todo.domain.card.dto.CardResponse
import com.example.todo.domain.card.dto.CreateCardRequest
import com.example.todo.domain.card.dto.UpdateCardRequest
import com.example.todo.domain.card.service.CardService
import org.springframework.http.HttpStatus
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
class CardController(
    private val cardService: CardService
) {

    @GetMapping
    fun getCardList(): ResponseEntity<List<CardResponse>> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(cardService.getAllCardList())
    }

    @GetMapping("/{todosId}")
    fun getCard(@PathVariable todosId: Long
    ): ResponseEntity<CardResponse> {
        return ResponseEntity.status(HttpStatus.OK)
            .body(cardService.getCardById(todosId))
    }

    @PostMapping
    fun createCard(
        @RequestBody createCardRequest: CreateCardRequest
    ): ResponseEntity<CardResponse> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(cardService.createCard(createCardRequest))
    }

    @PutMapping("/{todosId}")
    fun updateCard(
        @PathVariable todosId: Long,
        @RequestBody updateCardRequest: UpdateCardRequest
    ): ResponseEntity<CardResponse> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(cardService.updateCard(todosId,updateCardRequest))
    }

    @DeleteMapping("/{todosId}")
    fun deleteCard(@PathVariable todosId: Long): ResponseEntity<Unit> {
        cardService.deleteCard(todosId)
        return ResponseEntity
            .status(HttpStatus.NO_CONTENT)
            .build()
    }

}