package com.example.mathquiz.domain.usecases

import com.example.mathquiz.domain.entetys.GameSettings
import com.example.mathquiz.domain.entetys.Level
import com.example.mathquiz.domain.repository.GameRepository

class GetGameSettingsUseCase(private val repository: GameRepository) {
    operator fun invoke(level: Level):GameSettings{
        return repository.getGameSettings(level)
    }
}