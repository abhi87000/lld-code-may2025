package com.scaler.tictactoemay2025.model;

import java.util.List;

public class Game {
    private List<Player> players;
    private Board board;
    private List<Move> moves;
    private Player winner;
    private GameState gameState;
    private int nextMovePlayerIndex;
    //private List<WinningStrategy> winningStrategies;
    

    
    public List<Player> getPlayers() {
        return players;
    }
    public Board getBoard() {
        return board;
    }
    public List<Move> getMoves() {
        return moves;
    }
    public Player getWinner() {
        return winner;
    }
    public GameState getGameState() {
        return gameState;
    }
    public int getNextMovePlayerIndex() {
        return nextMovePlayerIndex;
    }
    public void setPlayers(List<Player> players) {
        this.players = players;
    }
    public void setBoard(Board board) {
        this.board = board;
    }
    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }
    public void setWinner(Player winner) {
        this.winner = winner;
    }
    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }
    public void setNextMovePlayerIndex(int nextMovePlayerIndex) {
        this.nextMovePlayerIndex = nextMovePlayerIndex;
    }
    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }
    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    
}
