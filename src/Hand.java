import CardTypes.Card;
import CardTypes.CardType;
import Positions.HandPosition;

import java.util.*;

public class Hand{
    private int playerInx;
    private int handSize = 8;
    private Dictionary<HandPosition,Optional<Card>> cardsInHand;
    private List<Optional<Card>> pickedCards;
    private DrawingAndThrashPile drawingAndThrashPile;

    public Hand(int playerInx){
        this.playerInx = playerInx;
        for(int i = 0;i < handSize;i++){
            HandPosition position = new HandPosition(i,playerInx);
            cardsInHand.put(position,Optional.empty());
        }
    }

    public List<Optional<Card>> pickCards(List<HandPosition> positions){
        pickedCards = new ArrayList<>();
        for(HandPosition pos: positions){
            pickedCards.add(cardsInHand.get(pos));
        }
        return pickedCards;
    }

    public Dictionary<HandPosition,Optional<Card>> removePickedCardsAndRedraw(){
        List<Optional<Card>> newPick = drawingAndThrashPile.discardAndDraw(pickedCards);

        //replace old cards in hand with new ones
        for(int i = 0;i < pickedCards.size();i++){
            HandPosition cardKey = new HandPosition(0,playerInx);
            for (Iterator<HandPosition> it = cardsInHand.keys().asIterator(); it.hasNext(); ) {
                HandPosition pos = it.next();
                if(cardsInHand.get(pos) == pickedCards.get(i)) {
                    cardKey = pos;
                    break;
                }
            }
            cardsInHand.put(cardKey,newPick.get(i));
        }
        pickedCards = newPick;
        return cardsInHand;
    }

    public void returnPickedCards(){}

    public HandPosition hasCardOfType(CardType cardType){
        HandPosition handPosition = null;
        for(Iterator<HandPosition> it = cardsInHand.keys().asIterator(); it.hasNext();) {
            HandPosition pos = it.next();
            if(cardsInHand.get(pos).isPresent() && cardsInHand.get(pos).get().getCardType() == cardType){
                handPosition = pos;
                break;
            }
        }
        return handPosition;
    }

    public List<Card> getCards(){
        List<Card> cards = new ArrayList<>();
        for(Iterator<HandPosition> it = cardsInHand.keys().asIterator(); it.hasNext();){
            HandPosition pos = it.next();
            if(cardsInHand.get(pos).isPresent()){
                cards.add(cardsInHand.get(pos).get());
            }
        }
        return cards;
    }

}