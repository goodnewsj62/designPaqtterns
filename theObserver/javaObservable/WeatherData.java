import java.util.Observable;

public class WeatherData extends Observable {
    private double temperature;
    private double humidity; 
    private double pressure;

    public WeatherData(){}


    public void measurementChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurement(double temp,  double humidity,  double pressure){
        this.temperature  =  temp;
        this.humidity =  humidity; 
        this.pressure =  pressure;  
        measurementChanged();
    }

    public double getTemperature( ){
        return temperature;
    }

    public double getHumidity(){
        return humidity;
    }

    public double getPressure(){
        return pressure;
    }
}
