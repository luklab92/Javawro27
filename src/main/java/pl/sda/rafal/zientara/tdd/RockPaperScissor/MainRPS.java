package pl.sda.rafal.zientara.tdd.RockPaperScissor;

import pl.sda.rafal.zientara.tdd.RockPaperScissor.Players.Player;
import pl.sda.rafal.zientara.tdd.RockPaperScissor.Players.RandomPlayer;
import pl.sda.rafal.zientara.tdd.RockPaperScissor.Players.ScannerPlayer;

public class MainRPS {
    public static void main(String[] args) {
        Player player1 = new RandomPlayer();
        Player player2 = new ScannerPlayer();

        GameAction action1 = player1.getAction();
        GameAction action2 = player2.getAction();

        GameResult result = getResult(action1, action2);
        System.out.println("Player 1 action: " + action1);
        System.out.println("Player 2 action: " + action2);
        System.out.println(result);
    }

    private static GameResult getResult(GameAction action1, GameAction action2) {
        if (action1 == action2){
            return GameResult.DRAW;
        }
        if (action1 == GameAction.PAPER && action2 == GameAction.ROCK){
            return GameResult.PLAYER_1_WIN;
        }
        if (action1 == GameAction.ROCK && action2 == GameAction.SCISSORS){
            return GameResult.PLAYER_1_WIN;
        }
        if (action1 == GameAction.SCISSORS && action2 == GameAction.PAPER){
            return GameResult.PLAYER_1_WIN;
        }
        return GameResult.PLAYER_2_WIN;
    }


}
