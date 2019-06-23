package extendsandimple;

public abstract class Animal {

    String name ;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


    public abstract int getAge();
}
