package com.example.todo.domain.comment.controller

import com.example.todo.domain.comment.dto.AddCommentRequest
import com.example.todo.domain.comment.dto.CommentResponse
import com.example.todo.domain.comment.dto.UpdateCommentRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/todos/{todosId}/comments")
@RestController
class CommentController {

    @GetMapping
    fun getCommentList(
        @PathVariable todosId: Long
    ): ResponseEntity<List<CommentResponse>> {
        TODO()
    }

    @GetMapping("/{commentsId}")
    fun getComment(
        @PathVariable todosId: Long, @PathVariable commentsId: Long
    ): ResponseEntity<CommentResponse> {
        TODO()
    }

    @PostMapping
    fun addComment(
        @PathVariable todosId: Long,
        @RequestBody addCommentRequest: AddCommentRequest
    ): ResponseEntity<CommentResponse> {
        TODO()
    }

    @PutMapping("/{commentsId}")
    fun updateComment(
        @PathVariable todosId: Long,
        @PathVariable commentsId: Long,
        @RequestBody updateCommentRequest: UpdateCommentRequest
    ): ResponseEntity<AddCommentRequest> {
        TODO()
    }

    @DeleteMapping("/{commentsId}")
    fun removeComments(
        @PathVariable todosId: Long,
        @PathVariable commentsId: Long
    ): ResponseEntity<Unit> {
        TODO()
    }



}