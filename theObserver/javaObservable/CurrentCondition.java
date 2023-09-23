import java.util.Observable;
import java.util.Observer;

public class CurrentCondition implements Observer, DisplayInterface {
    Observable observable;
    private double temperature; 
    private double humidity; 
    private  double pressure; 

    public CurrentCondition(Observable observable ){
        this.observable =  observable;
        this.observable.addObserver(this);
    }


    @Override
    public void update(Observable observable,  Object arg){
        if(observable instanceof WeatherData){
            WeatherData weatherData =  (WeatherData)observable;
            this.temperature =  (weatherData).getTemperature();
            this.pressure =  weatherData.getPressure();
            this.humidity =  weatherData.getHumidity();
            return;
        }
        throw new IllegalArgumentException("first argument object must be of type weather");
    }

    public void display(){
        System.out.println("\nThis is the  current condition of the weather \n temperature: " + this.temperature +  "F \n pressure: " +  this.pressure +  "atm \n humidity: "+  this.humidity);
    }
}
