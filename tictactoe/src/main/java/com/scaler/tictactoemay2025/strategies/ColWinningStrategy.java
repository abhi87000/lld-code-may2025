package com.scaler.tictactoemay2025.strategies;

import java.util.HashMap;
import java.util.Map;

import com.scaler.tictactoemay2025.model.Board;
import com.scaler.tictactoemay2025.model.Move;

public class ColWinningStrategy implements WinningStrategy {
    private Map<Integer, HashMap<String, Integer>> counts = new HashMap<>();
    // | 0 | -> {X -> 0; O -> 0}
    // | 1 | -> {X -> 0; O -> 0}
    // | 2 |
    // | 3 |

    @Override
    public boolean checkWinner(Board board, Move move) {
        return true;
    }

  
    @Override
    public void handleUndo(Board board, Move move) {
    }
    
}
