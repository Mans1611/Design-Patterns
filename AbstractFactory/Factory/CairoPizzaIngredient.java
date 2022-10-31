package AbstractFactory.Factory;

import AbstractFactory.Cheese.Cheese;
import AbstractFactory.Cheese.OborLandChees;
import AbstractFactory.Clams.Clam;
import AbstractFactory.Dough.Dough;
import AbstractFactory.Dough.ThickDough;
import AbstractFactory.Sauce.Sauce;
import AbstractFactory.Sauce.TommatoSauce;
import AbstractFactory.Veggies.Veggies;
import AbstractFactory.pepperoni.Pepperoni;
import AbstractFactory.pepperoni.SlicedPepproni;

public class CairoPizzaIngredient implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickDough();
    }

    @Override
    public Sauce createSauce() {
        return new TommatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new OborLandChees() ;
    }

    @Override
    public Veggies[] createVeggies() {
        
        return null;
    }

    @Override
    public Pepperoni createPeppperoni() {
        return new SlicedPepproni();
    }

    @Override
    public Clam createClam() {
       
        return null;
    }
    
}
