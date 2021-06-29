import java.util.ArrayList;

/** the class of the zoo */
public class Zoo {
    private static Zoo instance = null;
    private int happinessLevel;
    private int hungryLevel;
    private final ArrayList <Animal> animalList = new ArrayList<>();
    private final ArrayList<ZooObserver> observers = new ArrayList<>();

    private Zoo(int happinessLevel, int hungryLevel) {
        this.happinessLevel = happinessLevel;
        this.hungryLevel = hungryLevel;
    }
    /** using the singleton method  */
    public static Zoo getInstance() {
        if (instance == null) {
            System.out.println("Creating zoo...");
            instance = new Zoo( 2,3);
        }
        else
            System.out.println("The zoo already exists...");

        return instance;
    }
    /** check conditions of happiness and update them */
    public void watchAnimals(){
        if (this.happinessLevel < 5)
            this.happinessLevel++;
        if(this.hungryLevel < 5)
            this.hungryLevel++;
        for (Animal animal: this.animalList)
            animal.participatedInShow();
        notifyObserver("The animals are being watched");
    }
    /** check conditions of hunger and update them */
    public void feedAnimals(){
        if(this.hungryLevel > 1)
            this.hungryLevel--;
        for (Animal animal: this.animalList)
            animal.eat();
        notifyObserver("The animals are being fed");
    }

    /** add animal */
    public void addAnimal(Animal animal){
        this.animalList.add( animal);
        notifyObserver(animal.getName() + " has been added to the zoo!");
    }

    /** show the info of the all the animals that in the zoo */
    public void showAnimalsInfo(){
        int counterZebra = 0;
        int counterMonkey = 0;
        int counterUnicorn = 0;
        for(Animal animal: this.animalList ){
            if( animal.getName().equals("Zebra")){
                counterZebra++;
            }
            if( animal.getName().equals("Monkey")){
                counterMonkey++;
            }
            if( animal.getName().equals("Unicorn")){
                counterUnicorn++;
            }
        }

        System.out.println("The zoo contains total of " +
                this.animalList.size() + " animals:");
        System.out.println("- Zebra: " + counterZebra);
        System.out.println("- Unicorn: " + counterUnicorn);
        System.out.println("- Monkey: " + counterMonkey);
        System.out.println("Happiness level: " + this.happinessLevel);

        if(this.happinessLevel < 3)
            System.out.println("The animals are not happy," +
                    " you should watch them...");
        else
            System.out.println("The animals are very happy," +
                    " keep working hard...");
        System.out.println("Hunger level: " + this.hungryLevel);
        if(this.hungryLevel > 3)
            System.out.println("The animals are hungry," +
                    " you should feed them...");
    }

    /** add observer */
    public void addObserver(ZooObserver observer){
        this.observers.add(observer);
    }

    /** remove observer*/
    public void removeObserver(ZooObserver observer){
        this.observers.remove(observer);
    }

    /** notify observer */
    public void notifyObserver(String message){
        System.out.println("Notifying observers:");
        for(ZooObserver observer: this.observers){
            observer.update(message);
        }
    }
}
