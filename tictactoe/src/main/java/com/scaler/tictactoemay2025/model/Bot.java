package com.scaler.tictactoemay2025.model;

public class Bot extends Player {

    public Bot(Long id, String name, String symbol, PlayerType type) {
        super(id, name, symbol, type);
        // THIS IS NEEDED, BECAUSE PARENT CLASS TAKES A CONSTRUCTOR.
    }

    private DifficultyLevel botDifficultyLevel;

    public DifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }
    public void setBotDifficultyLevel(DifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }
    
    
}
