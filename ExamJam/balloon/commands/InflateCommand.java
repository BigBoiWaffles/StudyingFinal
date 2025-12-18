package balloon.commands;

import balloon.Balloon;

abstract class InflateCommand implements BalloonCommand {
    protected Balloon balloon;
    public InflateCommand(Balloon balloon){
        this.balloon = balloon;
    }
}
