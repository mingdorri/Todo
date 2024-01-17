package com.example.todo.domain.todo.controller

import com.example.todo.domain.exception.ModelNotFoundException
import com.example.todo.domain.todo.dto.TodoResponse
import com.example.todo.domain.todo.dto.CreateTodoRequest
import com.example.todo.domain.todo.dto.UpdateTodoRequest
import com.example.todo.domain.todo.service.TodoService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/todos")
@RestController
class TodoController(
    private val todoService: TodoService
) {

    @GetMapping
    fun getCardList(): ResponseEntity<List<TodoResponse>> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(todoService.getAllCardList())
    }

    @GetMapping("/{todosId}")
    fun getCard(@PathVariable todosId: Long
    ): ResponseEntity<TodoResponse> {
        return ResponseEntity.status(HttpStatus.OK)
            .body(todoService.getCardById(todosId))
    }

    @PostMapping
    fun createCard(
        @RequestBody createTodoRequest: CreateTodoRequest
    ): ResponseEntity<TodoResponse> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(todoService.createCard(createTodoRequest))
    }

    @PutMapping("/{todosId}")
    fun updateCard(
        @PathVariable todosId: Long,
        @RequestBody updateTodoRequest: UpdateTodoRequest
    ): ResponseEntity<TodoResponse> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(todoService.updateCard(todosId,updateTodoRequest))
    }

    @DeleteMapping("/{todosId}")
    fun deleteCard(@PathVariable todosId: Long): ResponseEntity<Unit> {
        todoService.deleteCard(todosId)
        return ResponseEntity
            .status(HttpStatus.NO_CONTENT)
            .build()
    }




}