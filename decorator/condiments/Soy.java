package condiments;

import beverages.Beverage;

public class Soy extends Condiment{
    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage =  beverage;
    }


    public String getDescription(){
        return "Soy " +  this.beverage.getDescription();
    }

    public double cost(){
        return .28 + this.beverage.cost();
    }
}
