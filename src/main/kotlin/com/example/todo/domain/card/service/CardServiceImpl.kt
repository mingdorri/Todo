package com.example.todo.domain.card.service

import com.example.todo.domain.card.dto.CardResponse
import com.example.todo.domain.card.dto.CreateCardRequest
import com.example.todo.domain.card.dto.UpdateCardRequest
import org.springframework.stereotype.Service

@Service
class CardServiceImpl: CardService {
    override fun getAllCardList(): List<CardResponse> {
        // TODO: DB에서 모든 CARD 목록을 조회하여 CardResponse 목록으로 변환 후 반환
        TODO("Not yet implemented")
    }

    override fun getCardById(todosId: Long): CardResponse {
        // TODO: DB에서 ID 기반으로 CARD 를 가져와서 CardResponse로 변환 후 반환
        TODO("Not yet implemented")
    }

    override fun createCard(request: CreateCardRequest): CardResponse {
       // TODO: request를 Card로 변환 후 저장
        TODO("Not yet implemented")
    }

    override fun updateCard(todosId: Long, request: UpdateCardRequest): CardResponse {
       // TODO: DB에서 todosId에 해당하는 card를 가져와서 request기반으로 업데이트 후 db에 저장, 결과를 CardResponse로 변환 후 반환
        TODO("Not yet implemented")
    }

    override fun deleteCard(todosId: Long) {
        // TODO: DB에서 todosId에 해당하는 Card를 삭제, 연관된 CardApplication과 Comment도 모두 삭제
        TODO("Not yet implemented")
    }

}