package MyTicTacToeImplementation.model;

import MyTicTacToeImplementation.constant.GameState;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Game {
    public List<Player> players;
    public Board board;
    public List<Move> moves;
    public GameState currentGameState;
    public Player winner;
    public boolean isWinnerAvailable;
    public int playerTurnIdx;
    public List<String> gameRules;
    Map<Integer,Player> playerTurn;

    public void addPlayer()
    {

    }
    public void addMove()
    {

    }
    public Player getPlayerTurn()
    {
        if(playerTurn.isEmpty())
        {
            generatePlayerTurns();
        }
        int playerIndex = playerTurnIdx % players.size();
        System.out.println("Player "+playerIndex +"turn ");
        return playerTurn.get(playerIndex);
    }

    private void generatePlayerTurns() {
        List<Player> players1 = new ArrayList<>(players);
        Player currentPlayerTurn;
        int n = players1.size();
        for (int i = 0; i < n; i++) {
            Random random = new Random();
            int j = random.nextInt(players1.size());
            currentPlayerTurn = players1.get(j);
            playerTurn.put(j,currentPlayerTurn);
            players1.remove(j);
        }
    }

}
