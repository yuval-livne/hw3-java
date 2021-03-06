/** class animal */
public  class Animal {
    private final String name;

    public Animal(String name){
        this.name = name;
    }
    /** this part describe the food of the animal */
    public void eat(){
        if (this.name.equals("Zebra"))
            System.out.println("The zebra is eating grass...");
        if (this.name.equals("Monkey"))
            System.out.println("The monkey is eating a banana...");
        if (this.name.equals("Unicorn"))
            System.out.println("The unicorn is eating rainbow cakes...");
    }
    /** this part describe the actions of the animal */
    public void participatedInShow(){
        if (this.name.equals("Zebra"))
            System.out.println("The zebra is running...");
        if (this.name.equals("Monkey"))
            System.out.println("The monkey is hanging on trees...");
        if (this.name.equals("Unicorn"))
            System.out.println("The unicorn is flying...");
    }

    public String getName(){
        return this.name;
    }
}
