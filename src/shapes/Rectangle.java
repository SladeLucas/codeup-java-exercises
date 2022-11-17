package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int x, int y){
        x = length;
        y = width;
    }
    public int getArea(){
        int area = this.length * this.width;
        return area;
    }
    public int getPerimeter(){
        int perimeter = 2 * this.length + 2 * this.width;
        return perimeter;
    }
}
