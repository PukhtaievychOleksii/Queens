package Positions;

import java.util.Optional;

public class Position {
    private Optional<AwokenQueenPosition> awokenQueenPosition;
    private Optional<HandPosition> handPosition;
    private Optional<SleepingQueenPosition> sleepingQueenPosition;

    public Position(AwokenQueenPosition awokenQueenPosition){
        this.awokenQueenPosition = Optional.of(awokenQueenPosition);
    }

    public Position(HandPosition handPosition){
        this.handPosition = Optional.of(handPosition);
    }

    public Position(SleepingQueenPosition sleepingQueenPosition){
        this.sleepingQueenPosition = Optional.of(sleepingQueenPosition);
    }

    public Optional<AwokenQueenPosition> getAwokenQueenPositionOptional(){
        return awokenQueenPosition;
    }

    public Optional<HandPosition> getHandPosition(){
        return handPosition;
    }

    public Optional<SleepingQueenPosition> getSleepingQueenPosition(){
        return sleepingQueenPosition;
    }
}
