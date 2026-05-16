import java.util.*;
public class sub{
class Animal {

    String color = "White";
}

class Dog extends Animal {

    String color = "Black";

    void display() {

        System.out.println(super.color);
    }

    public static void main(String args[]) {

        Dog d = new Dog();

        d.display();
    }
}
}