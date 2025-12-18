package balloon.Strategies;

import balloon.Balloon;
import balloon.BalloonInflationStrategy;

public class FullStrategy implements BalloonInflationStrategy {
    @Override
    public void execute(Balloon balloon){
        balloon.inflate(balloon.getCapacity() - balloon.getAmount());
    }
}
