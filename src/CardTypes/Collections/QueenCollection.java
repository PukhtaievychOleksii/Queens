package CardTypes.Collections;

import CardTypes.Queen;
import Positions.Position;
import Positions.SleepingQueenPosition;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.Optional;

public class QueenCollection {
    protected List<Queen> queens;

    public void addQueen(Queen queen){
        queens.add(queen);
    }

    public Optional<Queen> removeQueen(SleepingQueenPosition position){
        return Optional.of(queens.remove(position.getCardIndex()));
    }

    public Dictionary<Position,Queen> getQueens(){
        Dictionary<Position,Queen> dictionary = new Hashtable<>();
        for(int i = 0;i < queens.size();i++){
            Position pos = new Position(new SleepingQueenPosition(i));
            dictionary.put(pos, queens.get(i));
        }
        return dictionary;
    }
}
