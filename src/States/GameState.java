package States;

import CardTypes.Card;
import CardTypes.Queen;
import Positions.AwokenQueenPosition;
import Positions.HandPosition;
import Positions.SleepingQueenPosition;

import java.util.Dictionary;
import java.util.List;
import java.util.Set;

public class GameState {
    private int numberOfPlayers;
    private int onTurn;
    private Set<SleepingQueenPosition> sleppingQueens;
    private Dictionary<HandPosition, Card> cards;
    private Dictionary<AwokenQueenPosition, Queen> awokenQueens;
    private List<Card> cardsDiscardedLastTurn;

    public void setNumberOfPlayers( int numberOfPlayers){
        this.numberOfPlayers = numberOfPlayers;
    }

    public void setOnTurn(int onTurn){
        this.onTurn = onTurn;
    }

    public int getOnTurn(){
        return onTurn;
    }


    public void setSleppingQueens(Set<SleepingQueenPosition> sleppingQueens){
        this.sleppingQueens = sleppingQueens;
    }

    public void setCards(Dictionary<HandPosition, Card> cards){
        this.cards = cards;
    }

    public void setAwokenQueens(Dictionary<AwokenQueenPosition, Queen> awokenQueens){
        this.awokenQueens = awokenQueens;
    }

    public void setCardsDiscardedLastTurn(List<Card> cardsDiscardedLastTurn){
        this.cardsDiscardedLastTurn = cardsDiscardedLastTurn;
    }




}
