package condiments;

import beverages.Beverage;

public class Mocha extends Condiment{
    Beverage beverage;

    public Mocha(Beverage beverage){
        if (beverage ==  null) throw new IllegalArgumentException("expected an instance of Beverage not null");
        this.beverage =  beverage;
    }

    public String getDescription(){
        return "Mocha " +  beverage.getDescription();
    }

    public double cost(){
        return 0.36 +  beverage.cost();
    }
}
