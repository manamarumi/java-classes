package Circle;

public class Circle {
    public double radious;
    public double diameter;
    
    public Circle () {

    }

    public Circle (double radious, double diameter) {
        this.radious = radious;
        this.diameter = 2 * radious;
    }

    public double getArea() {
       return radious * radious * 3.14;
    }

    public double getParameter() {
        return diameter * 3.14;
    }

}
