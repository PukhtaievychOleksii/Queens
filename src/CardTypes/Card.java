package CardTypes;

enum CardType{
    Number,
    King,
    Knight,
    SleepingPosion,
    Dragon,
    MagicWand
}

public class Card {
    private CardType type;
    private int value;

    public Card(CardType type, int value){
        this.type = type;
        this.value = value;
    }

}
