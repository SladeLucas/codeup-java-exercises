package shapes;

import util.Input;

public class Circle {
    private double radius;

    public Circle(double radius){
        radius = Input.getDouble();
        System.out.println("this.radius = " + this.radius);
    }
    public double getArea(){
        double area = (Math.PI * (this.radius * this.radius));
        return area;
    }
    public double getCircumference(){
        double circumference = (2 * Math.PI * this.radius);
        return circumference;
    }

}
