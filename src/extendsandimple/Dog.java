package extendsandimple;

public class Dog extends Animal implements Eat,Drink {
    @Override
    public void eatSth() {
        System.out.println("我要吃狗粮");
    }

    @Override
    public void drinkSth() {
        System.out.println("我要喝啤酒");
    }


    @Override
    public int getAge() {
        return 0;
    }
}