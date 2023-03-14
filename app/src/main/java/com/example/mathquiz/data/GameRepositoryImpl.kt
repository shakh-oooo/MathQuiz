package com.example.mathquiz.data

import com.example.mathquiz.domain.entetys.GameSettings
import com.example.mathquiz.domain.entetys.Level
import com.example.mathquiz.domain.entetys.Questions
import com.example.mathquiz.domain.repository.GameRepository
import kotlin.math.max
import kotlin.math.min
import kotlin.random.Random

class GameRepositoryImpl : GameRepository {

    private val MIN_SUM_VALUE = 2
    private val MIN_ANSWER_VALUE = 1

    override fun generateQuestions(maxSumValue: Int, countOfOptions: Int): Questions {
        val sum = Random.nextInt(MIN_SUM_VALUE, maxSumValue)
        val visibleNumber = Random.nextInt(MIN_ANSWER_VALUE, sum)
        val options = HashSet<Int>()
        val rightAnswer = sum - visibleNumber
        options.add(rightAnswer)
        val from = max(rightAnswer - countOfOptions, MIN_ANSWER_VALUE)
        val to = min(maxSumValue, rightAnswer + countOfOptions)
        while (options.size < countOfOptions) {
            options.add(Random.nextInt(from, to))
        }
        return Questions(sum, visibleNumber, options.toList())
    }

    override fun getGameSettings(level: Level): GameSettings {
        return when (level) {
            Level.TEST -> GameSettings(
                10, 3, 50, 8
            )
            Level.EASY -> GameSettings(
                10, 10, 70, 60
            )
            Level.NORMAL -> GameSettings(
                20, 20, 80, 40
            )
            Level.HARD -> GameSettings(
                30, 30, 90, 20
            )
        }
    }
}