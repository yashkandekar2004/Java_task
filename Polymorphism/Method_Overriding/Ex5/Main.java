class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }

    void sound() {
        System.out.println("Animal is making sound");
    }
}

class Lion extends Animal {
    void eat() {
        System.out.println("Lion eats meat");
    }

    void sound() {
        System.out.println("Lion roars");
    }
}

class Tiger extends Animal {
    void eat() {
        System.out.println("Tiger eats meat");
    }

    void sound() {
        System.out.println("Tiger growls");
    }
}

class Panther extends Animal {
    void eat() {
        System.out.println("Panther eats meat and sometimes fruits");
    }

    void sound() {
        System.out.println("Panther growls softly");
    }
}

class Main {
    public static void main(String[] args) {
        Animal a =new Animal();
        a.eat();
        a.sound();

        a = new Lion();
        System.out.println(" ----Lion-----");
        a.eat();
        a.sound();
        
        a = new Tiger();
        System.out.println(" ----Tiger-----");
        a.eat();
        a.sound();
        
        a = new Panther();
        System.out.println(" ----Panther-----");
        a.eat();
        a.sound();
    }
}
