package TrafficLightSystem;

import java.util.ArrayList;

public class TrafficCamera implements TrafficObserver{
    private ArrayList<LightState> statesRecording;

    public TrafficCamera(){
        this.statesRecording = new ArrayList<LightState>();
    }

    @Override
    public void update(LightState state){
        this.statesRecording.add(state);
        System.out.println(state);
    }
}
