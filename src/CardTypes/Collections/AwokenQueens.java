package CardTypes.Collections;

import CardTypes.Queen;
import Positions.AwokenQueenPosition;
import Positions.Position;

import java.util.Dictionary;
import java.util.Hashtable;

public class AwokenQueens extends QueenCollection {
    private int playerIndex;

    public AwokenQueens(int playerIndex){
        this.playerIndex = playerIndex;
    }

    @Override
    public Dictionary<Position, Queen> getQueens(){
        Dictionary<Position,Queen> dictionary = new Hashtable<>();
        for(int i = 0;i < queens.size();i++){
            Position pos = new Position(new AwokenQueenPosition(i,playerIndex));
            dictionary.put(pos, queens.get(i));
        }
        return dictionary;
    }
}
