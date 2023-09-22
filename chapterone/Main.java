import ducks.Duck;
import ducks.Mallard;

public class Main{
    public static void main(String[] args){
        Duck mallard =  new Mallard();

        mallard.performQuack();
        mallard.swim();
        mallard.peformFly();
        
    }
}