class Shape {
    double calculateArea() {
        System.out.println("Area of shape is: ");
        return 0;
    }
}

class Circle extends Shape {
    double calculateArea() {
        double radius = 3.14;
        return 3.14 * radius * radius;  
    }
}

class Rectangle extends Shape {
    double calculateArea() {
        double length = 4;
        double width = 5;
        return length * width;  
    }
}

class Triangle extends Shape {
    double calculateArea() {
        double base = 4;
        double height = 5;
        return 0.5 * base * height;  
    }
}

class Main {
    public static void main(String[] args) {
        Shape s = new Circle();
        System.out.println("Area of Circle: " + s.calculateArea());

        s = new Rectangle();
        System.out.println("Area of Rectangle: " + s.calculateArea());

        s = new Triangle();
        System.out.println("Area of Triangle: " + s.calculateArea());
    }
}
