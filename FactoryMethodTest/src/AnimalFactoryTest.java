public class AnimalFactoryTest {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.getAnimal(AnimalType.DOG);
        System.out.println(dog.makeSound());

        Animal cat = AnimalFactory.getAnimal(AnimalType.CAT);
        System.out.println(cat.makeSound());
    }
}
