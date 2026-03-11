package Abstraction;
// Abstraction: Used to define abstract classes and methods.
//              ->Abstraction is the process of hiding implementing the details
//               and showing only the essential features.
//              ->Abstract classes can't be Instanciated directly
//              ->Can contain 'abstract' methods (which mist be implemented)
//              ->can contain 'concrete' methods(which are inherited)

public class Main {
    public static void main(String[] args) {
        
    
    Circle c= new Circle(3);
    Triangle t=new Triangle(4,5);
    Rectangle r=new Rectangle(6, 7);

    // c.display();
    // t.display();
    // r.display();
    System.out.println("Area of Circle is"+c.area());
    System.out.println(t.area());
    System.out.println(r.area());
    } 
}
