class MonkeyFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Animal("Monkey");
    }
}