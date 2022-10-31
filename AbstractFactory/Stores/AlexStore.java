package AbstractFactory.Stores;

import AbstractFactory.Factory.AlexPizzaIngredient;
import AbstractFactory.Factory.PizzaIngredientFactory;
import AbstractFactory.Pizza.CheesPizza;
import AbstractFactory.Pizza.PepperoniPizza;
import AbstractFactory.Pizza.Pizza;

public class AlexStore extends PizzaStore {

    Pizza pizza = null;
    PizzaIngredientFactory alexIngredient = new AlexPizzaIngredient();
    
    @Override
    protected Pizza createPizza(String item) {
        if(item.equals("cheese")){
            pizza = new CheesPizza(alexIngredient);
            pizza.setName("Alex Chess Pizza ");
        }
        
        else if(item.equals("pepproni")){
            pizza = new PepperoniPizza(alexIngredient);
            pizza.setName("Alex Pepproni Pizza ");
        }
        return null;
    }
}
