package ducks;

import fly.FlyWithWings;
import quacK.Quack;

public class Mallard extends Duck{
    

    public Mallard(){
        flyBehaviour =  new FlyWithWings();
        quackBehaviour =  new Quack();
    }

    @Override
    public void display(){
        System.out.println("i am a mallard duck");
    }
}
