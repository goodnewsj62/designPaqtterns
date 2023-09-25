import beverages.Beverage;
import beverages.Expresso;
import condiments.Condiment;
import condiments.Mocha;
import condiments.Soy;

public class Main{
    public static void main(String[] args) {
        /* to produce an expresso coffee mixed with soy topping and 
         * an extra mocha topping  we will use the decorator pattern
         * to add soy and mocha topping delecigating the cost from one 
         * decorator to the other like a chain until the concerate coffee object (Expresso)
         * 
         * if implemented otherwise using inheritance we would have too many methods and 
         * the variation possibility is endless (eg soy soy mocha  milk expresso).
         * 
         * if each variation are represented by a class extending an abstract supertype there 
         * would be a class explosion (each variation would require its on class) think of how to change all 125 classes cost if 
         * prices where to go up...
         * 
         * 
         * the decorator exxtends the superclass so that the decorator and the decorated(wrapped) can be 
         * interchanged anywhere in code... so we can call same method on decorator at runtime.
         * 
         * the decorator pattern strives to keep our code open to extension and closed for modification
         * it does so adding responsibility to an object(extending) without us having to alter the object itself(modify)
         */
        Beverage beverage =  new Expresso();

        Condiment soy =  new Soy(beverage);
        Condiment mocha =  new Mocha(soy);

        /* lets pretend the below function is a client
         * asking for expresso mixed with mocha and mixed with soy
         * our client is expecting a Beverage that he ordered...
         * our decorator of mocha is passed in with no complain from the 
         * comiler at compile time cause mocha is deguised as a beverage 
         * whereas it's just wrapping a beverage or beverage like object: Therefore 
         * we can say mocha is composed of a beverage 
         */
        clientMochaSoyExpresso(mocha);

        mocha =  new Mocha(mocha);
        System.out.println("\n");
        clientMochaMochaSoyExpresso(mocha);

    }


    public static void clientMochaSoyExpresso(Beverage beverage){
        System.out.println("Thanks! i got the:  " +beverage.getDescription());
        System.out.println("at a resonable cost of: " +beverage.cost());
    }
    public static void clientMochaMochaSoyExpresso(Beverage beverage){
        System.out.println("Thanks! i got the:  " +beverage.getDescription());
        System.out.println("at a resonable cost of: " +beverage.cost());
    }
}