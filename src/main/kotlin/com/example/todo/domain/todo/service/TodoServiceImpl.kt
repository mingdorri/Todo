package com.example.todo.domain.todo.service

import com.example.todo.domain.exception.ModelNotFoundException
import com.example.todo.domain.todo.dto.CreateTodoRequest
import com.example.todo.domain.todo.dto.TodoResponse
import com.example.todo.domain.todo.dto.UpdateTodoRequest
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class TodoServiceImpl : TodoService {
    override fun getAllCardList(): List<TodoResponse> {
        // TODO: DB에서 모든 CARD 목록을 조회하여 CardResponse 목록으로 변환 후 반환
        TODO("Not yet implemented")
    }

    override fun getCardById(todosId: Long): TodoResponse {
        // TODO: 만약 todoId에 해당하는 todo가 없다면 throw ModelNotFoundException
        // TODO: DB에서 ID 기반으로 CARD 를 가져와서 CardResponse로 변환 후 반환
        TODO("Not yet implemented")
        throw ModelNotFoundException(modelName = "Todo", id = 1L)
    }


    @Transactional
    override fun createCard(request: CreateTodoRequest): TodoResponse {
        // TODO: request를 Card로 변환 후 저장
        TODO("Not yet implemented")
    }

    @Transactional
    override fun updateCard(todosId: Long, request: UpdateTodoRequest): TodoResponse {
        // TODO: 만약 todoId에 해당하는 todo가 없다면 throw ModelNotFoundException
        // TODO: DB에서 todosId에 해당하는 card를 가져와서 request기반으로 업데이트 후 db에 저장, 결과를 CardResponse로 변환 후 반환
        TODO("Not yet implemented")
    }

    @Transactional
    override fun deleteCard(todosId: Long) {
        // TODO: 만약 todoId에 해당하는 todo가 없다면 throw ModelNotFoundException
        // TODO: DB에서 todosId에 해당하는 Card를 삭제, 연관된 CardApplication과 Comment도 모두 삭제
        TODO("Not yet implemented")
    }

}