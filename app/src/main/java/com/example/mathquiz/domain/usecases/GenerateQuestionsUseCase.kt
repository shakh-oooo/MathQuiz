package com.example.mathquiz.domain.usecases

import com.example.mathquiz.domain.entetys.Questions
import com.example.mathquiz.domain.repository.GameRepository

class GenerateQuestionsUseCase(private val repository: GameRepository) {
    operator fun invoke(maxSumValue: Int): Questions {
        return repository.generateQuestions(maxSumValue, COUNT_OF_OPTIONS)
    }

    private companion object {
        private const val COUNT_OF_OPTIONS = 6
    }

}
