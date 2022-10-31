package AbstractFactory.Pizza;

import AbstractFactory.Factory.PizzaIngredientFactory;

public class CheesPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public CheesPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }


    @Override
    void prepare() {
        System.out.println("preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }

    
}
