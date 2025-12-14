package gr.aueb.cf.cf9.ch15.abstract_classes;

public class Cat extends Animal{

    public Cat() {
    }

    public Cat(int id, String name) {
        super(id, name);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("She ate all her food!");
    }

    @Override
    public void speak() {
        System.out.println("Meow!");
    }
}
