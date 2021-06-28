import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private static Zoo instance = null;
    private int happinessLevel;
    private int hungryLevel;
    private ArrayList <Animal> animalList = new ArrayList<>();
    private ArrayList<ZooObserver> observers = new ArrayList<>();



    public void watchAnimals(){
        if (this.happinessLevel < 5)
            this.happinessLevel++;
        if(this.hungryLevel < 5)
            this.hungryLevel++;
        notifyObserver("The animals are being watched");
    }

    public void feedAnimals(){
        if(this.hungryLevel > 1)
            this.hungryLevel--;
        notifyObserver("The animals are being fed");
    }

    public void addAnimal(Animal animal){
        this.animalList.add( animal);
        notifyObserver(animal.getName() + " has been added to the zoo!");
    }

    public void showAnimalsInfo(){
        int counterZebra = 0;
        int counterMonkey = 0;
        int counterUnicorn = 0;
        for(Animal animal: this.animalList ){
            if( animal.getName() == "Zebra"){
                counterZebra++;
            }
            if( animal.getName() ==  "Monkey"){
                counterMonkey++;
            }
            if( animal.getName() == "Unicorn"){
                counterUnicorn++;
            }
        }

        System.out.println("The zoo contains total of" + this.animalList.size() + "animals:");
        System.out.println("- Zebra:" + counterZebra);
        System.out.println("- Unicorn:" + counterUnicorn);
        System.out.println("- Monkey:" + counterMonkey);
        System.out.println("Happiness level:" + this.happinessLevel);

        if(this.happinessLevel < 3)
            System.out.println("The animals are not happy, you should watch them...");
        else
            System.out.println("The animals are very happy, keep working hard...");
        System.out.println("Hunger level:" + this.hungryLevel);
        if(this.hungryLevel > 3)
            System.out.println("The animals are hungry, you should feed them...");
    }

    private Zoo(int happinessLevel, int hungryLevel) {
        this.happinessLevel = happinessLevel;
        this.hungryLevel = hungryLevel;
    }

    public static Zoo getInstance() {
        if (instance == null) {
            instance = new Zoo( 2,3);
        }
        return instance;
    }

    public void addObserver(ZooObserver observer){
        this.observers.add(observer);
    }

    public void removeObserver(ZooObserver observer){
        this.observers.remove(observer);

    }

    public void notifyObserver(String massege){
        System.out.println("Notifying observers:");
        for(ZooObserver observer: this.observers){
            observer.update(massege);
        }

    }




}