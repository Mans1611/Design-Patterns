package AbstractFactory.Pizza;

import AbstractFactory.Cheese.Cheese;
import AbstractFactory.Clams.Clam;
import AbstractFactory.Dough.Dough;
import AbstractFactory.Sauce.Sauce;
import AbstractFactory.Veggies.Veggies;
import AbstractFactory.pepperoni.Pepperoni;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clam clam;

    public String getName(){
        if(this.name == null)
            return "No name for this Pizza";

        return this.name;
    }
     // abstract methode, so every store extend this class will have to override it depends on the resturant way 
    abstract void prepare();

    // all of the down methods are the same for any stores in any regions. 
    // so  baking and boxing in Alex is the same as baking and boxing in Cairo.
    public void bake(){
        System.out.println("Baking");
    }
    public void cut(){
        System.out.println("Baking");
    }
    public void box(){
        System.out.println("Baking");
    }
    public void done(){
        System.out.println("Your Pizza is ready");
    }
    public void setName(String name){
        this.name = name;
        System.out.println(name);
    }


    public String toString(){
        StringBuffer result = new StringBuffer();

        result.append("----" + name + "---- \n");
        if(dough != null)
            result.append("Dough : " + dough + "\n");
        if(sauce != null)
            result.append("Sauce : " + sauce + "\n");
        if(cheese != null)
            result.append("cheese : " + cheese + "\n");
        
        return result.toString(); // as it from stringbuffer type
    }

}
