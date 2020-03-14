public class AnimalFactory {

    private AnimalFactory(){};

    public static Animal getAnimal (AnimalType animalType){
        switch (animalType){
            case CAT:
                return new Cat();
            case DOG:
                return new Dog();
            default:
                throw new IllegalArgumentException("This animal type is not exist");
        }
    }
}
