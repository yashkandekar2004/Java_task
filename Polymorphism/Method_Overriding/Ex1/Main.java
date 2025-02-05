class Animal {
    void sound() {
        System.out.println("Animal is making a sound");
    }
}

class Bird extends Animal {
    void sound() {
        System.out.println("Bird is making a sound");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat is making a sound");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.sound();

        myAnimal = new Bird();
        myAnimal.sound();

        myAnimal = new Cat();
        myAnimal.sound();
    }
}
