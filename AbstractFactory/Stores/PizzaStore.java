package AbstractFactory.Stores;
import AbstractFactory.Pizza.Pizza;



public abstract class PizzaStore {
    
    protected abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type){
        System.out.println(type);
        Pizza pizza = createPizza(type);
        System.out.println("Making your " + pizza.getName() + "--");
        pizza.bake();
        pizza.cut();
        pizza.box();
        pizza.done();
        return pizza;
    }
    
}
