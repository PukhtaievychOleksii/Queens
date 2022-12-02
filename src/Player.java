import CardTypes.Card;
import CardTypes.Collections.AwokenQueens;
import Positions.HandPosition;
import Positions.Position;
import States.PlayerState;

import java.util.List;
import java.util.Optional;

public class Player {
    private int playerIdx;
    private PlayerState playerState;
    private Hand hand;
    private AwokenQueens awokenQueens;

    public Player(int playerIdx){
        this.playerIdx = playerIdx;
        awokenQueens = new AwokenQueens(playerIdx);
    }

    public void play(List<Position> cards){

    }

    public PlayerState getPlayerState(){
        return playerState;
    }

}