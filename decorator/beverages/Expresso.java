package beverages;

public class Expresso extends Beverage {
    public Expresso(){
        this.description = "Expresso";  
    }

    @Override
    public double cost(){
        return 2.99;
    }
}
