package extendsandimple;

public class Cat extends Animal implements Eat,Drink {
    @Override
    public void eatSth() {
        System.out.println("我要吃猫粮");
    }

    @Override
    public void drinkSth() {
        System.out.println("我要喝纯净水");
    }

    @Override
    public int getAge() {
        return 100;
    }
}
