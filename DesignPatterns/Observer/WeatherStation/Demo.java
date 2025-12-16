package WeatherStation;

public class Demo {
    public static void main(String[] args){
        WeatherStation station = new WeatherStation();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        station.registerObserver(currentDisplay);
        station.registerObserver(statisticsDisplay);

        station.setMeasurements(80, 65, 30.4f);
        System.out.println(currentDisplay.display());
        System.out.println(statisticsDisplay.display());

        station.setMeasurements(82, 70, 29.2f);
        System.out.println(currentDisplay.display());
        System.out.println(statisticsDisplay.display());
    }
}
