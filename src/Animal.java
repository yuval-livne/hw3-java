public  class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }
    public void eat(){
        if (this.name == "Zebra")
            System.out.println("The zebra is eating grass...");
        if (this.name == "Monkey")
            System.out.println("The monkey is eating a banana...");
        if (this.name == "Unicorn")
            System.out.println("The unicorn is eating rainbow cakes...");
    }

    public void participatedInShow(){
        if (this.name == "Zebra")
            System.out.println("The zebra is running...");
        if (this.name == "Monkey")
            System.out.println("The monkey is hanging on trees...");
        if (this.name == "Unicorn")
            System.out.println("The unicorn is flying...");




    }

    public String getName(){
        return this.name;
    }
}
