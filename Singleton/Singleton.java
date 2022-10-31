

public class Singleton {

    private static volatile Singleton instance;

    Singleton(){
    }
    public static Singleton getInstance(){
        if(instance == null) {
            synchronized (Singleton.class){
                if(instance == null) 
                    instance =  new Singleton(); // lazy intilization.
                else{
                    return instance;
                }
            }

        }
        return instance;
    }

     
}
