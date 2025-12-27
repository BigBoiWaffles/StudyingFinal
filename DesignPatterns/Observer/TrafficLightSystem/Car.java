package TrafficLightSystem;

public class Car implements TrafficObserver{
    private String model;

    public Car(String model){
        this.model = model;
    }

    @Override
    public void update(LightState state){
        if (state == LightState.RED || state == LightState.YELLOW){
            System.out.println("stops");
        } else if (state == LightState.GREEN){
            System.out.println("proceeds");
        }
    }
}
