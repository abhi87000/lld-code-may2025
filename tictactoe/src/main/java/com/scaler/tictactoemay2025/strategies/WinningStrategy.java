package com.scaler.tictactoemay2025.strategies;

import com.scaler.tictactoemay2025.model.Board;
import com.scaler.tictactoemay2025.model.Move;

public interface WinningStrategy {
    boolean checkWinner(Board board, Move move);

    void handleUndo(Board board, Move move);
}
