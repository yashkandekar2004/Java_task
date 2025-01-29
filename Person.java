class Person {
    String name;
    int age;

  
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    void displayDetails(Person person) {
        // System.out.println("Name: " + person.name);
        // System.out.println("Age: " + person.age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25);
       
        int a =Integer.parseInt(args[0]);
        int b =Integer.parseInt(args[1]);
        System.out.println(a+b);
        person1.displayDetails(person1);
    }
}