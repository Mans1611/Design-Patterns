package AbstractFactory;

import AbstractFactory.Pizza.Pizza;
import AbstractFactory.Stores.CairoStore;
import AbstractFactory.Stores.PizzaStore;

public class AbstractFactory {
    public static void main (String[] args){
        PizzaStore restuarunt = new CairoStore();
        Pizza pizza = restuarunt.orderPizza("cheese");
        System.out.println(pizza);
    }
}