package Inheritacne;

public class Animal {
    void sound(){
        System.out.println("Animal Makes sound");
    }

}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("cat meow");
    }
}
class Cow extends Animal{
    void sound(){
        System.out.println("cou moos");
    }
}
class Geeks{
    public static void main(String args[]){
        Animal a=new Animal();
        a.sound();
        Animal c=new Dog();
        c.sound();
        Animal b=new Cat();
        b.sound();
        Animal d=new Cow();
        d.sound();
        
    }
}
