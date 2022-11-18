package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(double length, double width){
        super(length, width);
    }
////
    @Override
    public void setWidth(int width) {
        this.width = width;
    }
    @Override
    public void setLength(int length) {
        this.length = length;
    }
    @Override
    public int getArea(){
        int area = this.length * this.width;
        return area;
    }
    @Override
    public int getPerimeter(){
        int perimeter = 2 * this.length + 2 * this.width;
        return perimeter;
    }

}
