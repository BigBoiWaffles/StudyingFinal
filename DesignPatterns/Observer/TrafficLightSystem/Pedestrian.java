package TrafficLightSystem;

public class Pedestrian implements TrafficObserver{
    private String name;

    public Pedestrian(String name){
        this.name = name;
    }

    @Override
    public void update(LightState state){
        if(state == LightState.RED){
            System.out.println("crosses street");
        } else if (state == LightState.GREEN || state == LightState.YELLOW){
            System.out.println("waits");
        }
    }
}
