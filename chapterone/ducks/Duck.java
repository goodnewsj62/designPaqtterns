package ducks;

import fly.FlyBehaviour;
import quacK.QuackBehaviour;

public abstract class Duck {
    /*
     * --RULE 1: encapuslate what changes--
     * In this class we have manage to seperate methods or behaviours 
     * that varies across duck subtypes (quacking and flying) [plastic duck do not quack but sweak]. 
     * we divide the changing scope to different strategies
     * 
     * --RULE 2: code to interface than implementation--
     * one or two subclasses may depend on this seperated behaviour but if these subclasses directly 
     * inherit them they become fragile as a change to the parent class can cause one of those other child classes
     * to break and our code will be difficult to change wheich makes it inflexible.  
     * in order to avoid these each behaviour seperated (STRATEGY) implements a ceratin interface.
     * our subtypes will expect an object to be of the interface unlocking flexiblity to our code base.
     * at runtime we could easily switch behaviour as far as the behaviour implements a certain interface
     * 
     */
    protected FlyBehaviour flyBehaviour;
    protected QuackBehaviour quackBehaviour;

    public void swim(){
        System.out.println("i am swimming");
    }

    public void peformFly(){
        this.flyBehaviour.fly();
    }

    public void performQuack(){
        this.quackBehaviour.quack();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour){
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour  quackBehaviour){
        this.quackBehaviour =  quackBehaviour;
    }

    public abstract void  display();
}
