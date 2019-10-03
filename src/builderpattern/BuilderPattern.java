package builderpattern;
public class BuilderPattern {
    public static void main(String[] args) {
       
        Builder pizzamp = new Baharatli();
        Director direc = new Director();
        
        direc.olustur(pizzamp);
        
        System.out.println(pizzamp.pizza.hamur);
        System.out.println(pizzamp.pizza.turu);
        System.out.println(pizzamp.pizza.pizzaboy);
        
        
    }
    
}
