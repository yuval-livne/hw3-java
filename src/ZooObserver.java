public class ZooObserver implements Observer {
    String name;
    public ZooObserver(String name){
        this.name = name;
    }
    public void update(String message){
        System.out.println("[" + this.name + "] " + message);
    }
}
