package weatherData;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private double temperature; 
    private double pressure;
    private double humidity;


    public WeatherData( ){
        temperature =  123;
        pressure =  1;
        humidity =  8.98;
        observers =  new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o){
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o){
        int index = observers.indexOf(o);
        if(index  != -1){
            observers.remove(index);
        }
    }

    @Override
    public void notifyObserver(){
        for( Observer observer:this.observers  ){
            observer.update(this.temperature, this.humidity, this.pressure);;
        }
    }

    public void setTemperature(double temp){
        this.temperature =  temp;
    }

    public void setHumidity(double humidity){
        this.humidity =  humidity;
    }

    public void setPressure(double pressure){
        this.pressure =  pressure;
    }

}
