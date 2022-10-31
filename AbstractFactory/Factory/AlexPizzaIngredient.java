package AbstractFactory.Factory;

import AbstractFactory.Cheese.Cheese;
import AbstractFactory.Cheese.DomteyCheese;
import AbstractFactory.Clams.Clam;
import AbstractFactory.Dough.Dough;
import AbstractFactory.Dough.ThickDough;
import AbstractFactory.Sauce.Sauce;
import AbstractFactory.Sauce.TommatoSauce;
import AbstractFactory.Veggies.Onion;
import AbstractFactory.Veggies.Veggies;
import AbstractFactory.pepperoni.Pepperoni;

public class AlexPizzaIngredient implements PizzaIngredientFactory {

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
        return new DomteyCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Onion(),new Onion()};
        return veggies ;
    }

    @Override
    public Pepperoni createPeppperoni() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Clam createClam() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
