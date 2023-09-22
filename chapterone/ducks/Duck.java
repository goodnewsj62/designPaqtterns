package ducks;

import fly.FlyBehaviour;
import quacK.QuackBehaviour;

public abstract class Duck {
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

    public abstract void  display();
}
