/**create zebra */
class ZebraFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Animal("Zebra");
    }
}