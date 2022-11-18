package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(double length, double width){
        super(length, width);
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea(){
        double area = this.length * this.width;
        return area;
    }
    @Override
    public double getPerimeter(){
        double perimeter = 2 * this.length + 2 * this.width;
        return perimeter;
    }

}
