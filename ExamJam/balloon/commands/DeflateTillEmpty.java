package balloon.commands;

import balloon.Balloon;

public class DeflateTillEmpty implements BalloonCommand {
    private Balloon balloon;

    public DeflateTillEmpty(Balloon balloon){
        this.balloon = balloon;
    }

    @Override
    public void execute(){
        this.balloon.deflate(this.balloon.getAmount());
    }
}
