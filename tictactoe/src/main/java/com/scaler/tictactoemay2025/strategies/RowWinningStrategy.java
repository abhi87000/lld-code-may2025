package com.scaler.tictactoemay2025.strategies;

import java.util.HashMap;
import java.util.Map;

import com.scaler.tictactoemay2025.model.Board;
import com.scaler.tictactoemay2025.model.Move;

public class RowWinningStrategy implements WinningStrategy {
    // The HashMap to keep a Count.
    private Map<Integer, HashMap<String, Integer>> counts = new HashMap<>();
    // <RowNumber, Map<Symbol, Count>>
    


    @Override
    public boolean checkWinner(Board board, Move move) {
        return true;
    }



    @Override
    public void handleUndo(Board board, Move move) {}
    
}
