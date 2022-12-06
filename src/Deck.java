import CardTypes.Card;
import CardTypes.CardType;

import java.util.List;
import java.util.Random;

public class Deck {
    private List<Card> deck;

    public Deck(){
        deck.add(new Card(CardType.Dragon,10));
        deck.add(new Card(CardType.Knight,8));
    }

    public Card pickCard(){
        Random random = new Random();
        int index = random.nextInt(deck.size());
        Card card = deck.get(index);
        deck.remove(card);
        return card;
        //TODO: no cards case
    }
}
