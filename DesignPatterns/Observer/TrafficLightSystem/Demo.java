package TrafficLightSystem;

public class Demo {
    public static void main(String[] args){
        TrafficLight trafficLight = new TrafficLight();

        Car car1 = new Car("Car-1");
        Car car2 = new Car("Car-2");
        Pedestrian pedestrian1 = new Pedestrian("Alice");
        TrafficCamera camera = new TrafficCamera();

        trafficLight.attach(car1);
        trafficLight.attach(car2);
        trafficLight.attach(pedestrian1);
        trafficLight.attach(camera);

        System.out.println("=== Light changes to GREEN ===");
        trafficLight.notifyObservers(LightState.GREEN);

        System.out.println("\n=== Light changes to YELLOW ===");
        trafficLight.notifyObservers(LightState.YELLOW);

        System.out.println("\n=== Light changes to RED ===");
        trafficLight.notifyObservers(LightState.RED);

        System.out.println("\n=== Removing Car-1 ===");
        trafficLight.detach(car1);

        System.out.println("\n=== Light changes to GREEN again ===");
        trafficLight.notifyObservers(LightState.GREEN);
    }
}
