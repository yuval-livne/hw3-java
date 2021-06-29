/**create unicorn */
class UnicornFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Animal("Unicorn");
    }
}