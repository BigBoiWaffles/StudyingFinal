package balloon.commands;

import balloon.Balloon;

public class InflateTillFull extends InflateCommand{
    public InflateTillFull(Balloon balloon){
        super(balloon);
    }

    @Override
    public void execute() {
        this.balloon.inflate(this.balloon.getCapacity() - this.balloon.getAmount());
    }
}
