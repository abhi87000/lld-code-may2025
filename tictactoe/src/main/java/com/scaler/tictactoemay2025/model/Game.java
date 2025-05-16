package com.scaler.tictactoemay2025.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.scaler.tictactoemay2025.exception.DuplicateSymbolException;
import com.scaler.tictactoemay2025.exception.PlayerValidationException;
import com.scaler.tictactoemay2025.services.WinningStrategy;

public class Game {
    private List<Player> players; // Y
    private Board board; // Y
    private List<Move> moves; // N
    private Player winner; // N
    private GameState gameState; // N
    private int nextMovePlayerIndex; // N
    private List<WinningStrategy> winningStrategies; // Y
    
    private Game(int dimension, List<Player> players, List<WinningStrategy> winningStrategies){
        this.board = new Board(dimension);
        this.players = players;
        this.winningStrategies = winningStrategies;
        this.moves = new ArrayList<>();
        this.winner = null;
        this.gameState = GameState.IN_PROGRESS;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder{
        private List<Player> players;
        private int dimension;
        private List<WinningStrategy> winningStrategies;

        private Builder(){
            this.dimension = 0;
            this.players = new ArrayList<>();
            this.winningStrategies = new ArrayList<>();
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }
        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }
        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }
       
        public Game build() throws DuplicateSymbolException{
            runValidations();
            // This above method will throw exception if any validation fails.
            return new Game(dimension,players,winningStrategies);
        }

        private void runValidations() throws DuplicateSymbolException,PlayerValidationException  {
            validateForBotCount();
            validateSymbolForPlayer();
            // S3. Validate dimention -- (<3)
            // S4. Validate for number of Bots. (get player and get the type.)
        }

        private void validateForBotCount() throws PlayerValidationException {
            int botCount =0;
            for(Player p: players){
                if(p.getPlayerType().equals(PlayerType.BOT)){
                    botCount++;
                }
            }

            if(players.size() == botCount){
                throw new PlayerValidationException("All players are bots.");
            }
        }

        public void validateSymbolForPlayer() throws DuplicateSymbolException{
            Set<String> symbol = new HashSet<>();
            for(Player p: players){
                if(symbol.contains(p.getSymbol())) throw new DuplicateSymbolException("No duplicate symbols allowed.");

                // else add the symbol to set.
                symbol.add(p.getSymbol());
            }
        }



    }
    
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
