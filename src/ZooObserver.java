/** zoo observer*/
public class ZooObserver implements Observer {
    String name;
    public ZooObserver(String name){
        this.name = name;
    }
    /** update */
    public void update(String message){
        System.out.println("[" + this.name + "] " + message);
    }
}
