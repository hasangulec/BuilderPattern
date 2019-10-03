package builderpattern;
public class Pizza {
    int pizzaboy; String turu; String hamur;
    public int getPizzaboy() { return pizzaboy;}
    public void setPizzaboy(int pizzaboy) {this.pizzaboy = pizzaboy;}
    public String getTuru() {return turu;}
    public void setTuru(String turu) {this.turu = turu;}
    public String getHamur() {return hamur;}
    public void setHamur(String hamur) {this.hamur = hamur;}
}
abstract class Builder{
    abstract void pizzaboy();
    abstract void turu();
    abstract void hamur();
    protected Pizza pizza;
    public Pizza getPizza() {return pizza;}
    public void setPizza(Pizza pizza) {this.pizza = pizza;}
}
class DortMevsim extends Builder{
    public DortMevsim(){pizza=new Pizza();}
    public void pizzaboy(){pizza.setPizzaboy(10);}
    public void turu(){pizza.setTuru("Dörtmevsim");}
    public void hamur(){pizza.setHamur("İnce");}
}
class Baharatli extends Builder{
    public Baharatli(){pizza=new Pizza();}
    public void pizzaboy(){pizza.setPizzaboy(8);}
    public void turu(){pizza.setTuru("Baharatli");}
    public void hamur(){pizza.setHamur("Kalın");}
}
class Director{
    public void olustur(Builder pizza){
        pizza.pizzaboy();
        pizza.turu();
        pizza.hamur();
}
}