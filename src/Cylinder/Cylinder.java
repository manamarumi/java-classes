package Cylinder;

public class Cylinder {
    public double height;
    public double radious;

    public Cylinder() {
        
    }
    
    public Cylinder (double height, double radious) {
        this.height = height;
        this.radious = radious;

    }

    public double getVolume () {
        return height * radious * radious * 3.14 ;
    }
}
