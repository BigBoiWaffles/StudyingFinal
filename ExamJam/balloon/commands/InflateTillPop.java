package balloon.commands;

import balloon.Balloon;

public class InflateTillPop extends InflateCommand{
    public InflateTillPop(Balloon balloon){
        super(balloon);
    }

    @Override
    public void execute(){
        this.balloon.inflate(this.balloon.getCapacity());
    }
}
