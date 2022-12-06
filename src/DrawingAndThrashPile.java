import CardTypes.Card;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class DrawingAndThrashPile {
    private List<Card> cardsDiscardedThisTurn;
    private List<Card> discardingPile;
    private Deck deck;


    public List<Optional<Card>> discardAndDraw(List<Optional<Card>> discard){

        List<Optional<Card>> drawnCards = new ArrayList<>();
        for(int i = 0;i < discard.size();i++){
            if(discard.get(i).isPresent()) {
                cardsDiscardedThisTurn.add(discard.get(i).get());
                discardingPile.add(discard.get(i).get());
                drawnCards.add(Optional.of(deck.pickCard()));
            } else drawnCards.add(Optional.empty());
        }
        return drawnCards;
    }

    public void newTurn(){
        cardsDiscardedThisTurn = new ArrayList<>();
    }

    public List<Card> getCardsDiscardedThisTurn(){
        return cardsDiscardedThisTurn;
    }

    public Deck getDeck(){ return deck;}

}