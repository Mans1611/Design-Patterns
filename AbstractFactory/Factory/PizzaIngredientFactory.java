package AbstractFactory.Factory;

import AbstractFactory.Cheese.Cheese;
import AbstractFactory.Clams.Clam;
import AbstractFactory.Dough.Dough;
import AbstractFactory.Sauce.Sauce;
import AbstractFactory.Veggies.Veggies;
import AbstractFactory.pepperoni.Pepperoni;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPeppperoni();
    public Clam createClam();
}
