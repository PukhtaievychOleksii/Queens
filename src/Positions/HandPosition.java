package Positions;

public class HandPosition {
    private int cardIndex;
    private int playerIndex;

    public HandPosition(int index, int playerIndex){
        this.cardIndex = index;
        this.playerIndex = playerIndex;
    }

    public int getCardIndex(){
        return cardIndex;
    }

    public int getPlayerIndex(){
        return playerIndex;
    }

}
