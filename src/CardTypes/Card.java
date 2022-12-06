package CardTypes;


public class Card {
    private CardType type;
    private int value;

    public Card(CardType type, int value){
        this.type = type;
        this.value = value;
    }

    public CardType getCardType(){
        return type;
    }

}
