package com.example.mathquiz.domain.repository

import com.example.mathquiz.domain.entetys.GameSettings
import com.example.mathquiz.domain.entetys.Level
import com.example.mathquiz.domain.entetys.Questions

interface GameRepository {

    fun generateQuestions(
        maxSumValue : Int,
        countOfOptions:Int
    ):Questions

    fun getGameSettings(level: Level):GameSettings
}