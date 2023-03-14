package com.example.mathquiz.domain.entetys

data class GameSettings(
    val maxSumValues: Int,
    val minCountOfRightAnswers: Int,
    val minPercentOfRightAnswers: Int,
    val gameTimeInSec: Int
)
