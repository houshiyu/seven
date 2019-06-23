import extendsandimple.Animal;
import extendsandimple.Cat;
import extendsandimple.Dog;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");


        Cat cat = new Cat();
        cat.setName("77");
        System.out.println(cat.getName());
        cat.eatSth();
        cat.drinkSth();


        Dog dog = new Dog();
        dog.setName("piaopiao");
        dog.eatSth();
        dog.drinkSth();
    }
}
