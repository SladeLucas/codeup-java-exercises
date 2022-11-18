package shapes;

public class ShapesTest {
    public static void main(String[] arg){
        Measurable myShape;
        Measurable myShape2;

        myShape = new Square(5);
        myShape2 = new Rectangle(4, 5);


        //Rectangle box1 = new Rectangle(4, 5);
        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
        //Rectangle box2 = new Square(5);
        System.out.println("myShape2.getArea() = " + myShape2.getArea());
        System.out.println("myShape2.getPerimeter() = " + myShape2.getPerimeter());
    }
}
