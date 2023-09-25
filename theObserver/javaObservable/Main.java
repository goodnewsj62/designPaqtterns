public class Main{
    public static void main(String[] args){
        WeatherData weatherData =  new WeatherData();
        
        CurrentCondition currentCondition =  new CurrentCondition(weatherData);
        currentCondition.display();

        weatherData.setMeasurement(200, 49.1, 1.4);

        currentCondition.display();

        weatherData.setMeasurement(100.09, 1.1, 56.78);

        currentCondition.display();
    }
}