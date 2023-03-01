import Circle.Circle;
import Cylinder.Cylinder;

public class App {
    public static void main(String[] args) throws Exception {
      

        Circle circle1 = new Circle(3, 2);

        System.out.println("Area of circle : " + circle1.getArea());
        System.out.println("Parameter of circle : " + circle1.getParameter());

        Cylinder cylinder1 = new Cylinder(5, 4);

        System.out.println("Volume of circle : " + cylinder1.getVolume());

    }
}
