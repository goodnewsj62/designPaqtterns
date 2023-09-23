import representers.CurrentConditionDisplay;
import weatherData.WeatherData;

public class Main{
    public static void main(String[] args){
        WeatherData weatherDataObj = new WeatherData();

        CurrentConditionDisplay currentWeather = new CurrentConditionDisplay(weatherDataObj);
        weatherDataObj.notifyObserver();
        currentWeather.dispalay();

        weatherDataObj.setHumidity(50.9);
        weatherDataObj.setPressure(1.2);

        weatherDataObj.notifyObserver();
        currentWeather.dispalay();
    }
}