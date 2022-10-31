package AbstractFactory.Stores;

import AbstractFactory.Factory.CairoPizzaIngredient;
import AbstractFactory.Factory.PizzaIngredientFactory;
import AbstractFactory.Pizza.CheesPizza;
import AbstractFactory.Pizza.PepperoniPizza;
import AbstractFactory.Pizza.Pizza;

public class CairoStore extends PizzaStore {

    Pizza pizza = null;
    PizzaIngredientFactory cairoIngredient = new CairoPizzaIngredient();



    @Override
    protected Pizza createPizza(String item) {
        
        if(item.equals("cheese")){
            pizza = new CheesPizza(cairoIngredient);
            pizza.setName("Cairo Chess Pizza ");
        }
        else if(item.equals("pepproni")){
            pizza = new PepperoniPizza(cairoIngredient);
            pizza.setName("Cairo Pepproni Pizza ");
        }
        return null;
    }

    
}
