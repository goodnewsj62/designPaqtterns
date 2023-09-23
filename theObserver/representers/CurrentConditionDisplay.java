package representers;

import weatherData.Observer;
import weatherData.Subject;

public class CurrentConditionDisplay implements Observer, RepesentersInterFace{
    private Subject subject;
    private double temperature; 
    private double pressure; 
    private double humidity;

    public CurrentConditionDisplay(Subject subject){
        this.subject  =  subject;
        subject.registerObserver(this);
    }

    public void  update(double temp, double humidity,  double pressure){
        this.temperature =  temp;
        this.pressure =  pressure;
        this.humidity =  humidity;
        this.dispalay();
    }

    public void dispalay(){
        System.out.println("It is " +  this.temperature +"F\nthe humity is : " + this.humidity+  "\nthe pressure now is: " +  this.pressure);
    }

    public void unRegister( ){
        subject.removeObserver(this);
    }
}
