import CardTypes.Card;

import java.util.ArrayList;
import java.util.List;

public class DrawingAndThrashPile {

    private List<Card> cardsDiscardedThisTurn;

    public List<Card> discardAndDraw(List<Card> discard){
        cardsDiscardedThisTurn = discard;
    }

    public void newTurn(){
        cardsDiscardedThisTurn = new ArrayList<>();
    }

    public List<Card> getCardsDiscardedThisTurn(){
        return cardsDiscardedThisTurn;
    }

}