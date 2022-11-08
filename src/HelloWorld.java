public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello,");
        System.out.print(" World!");

        int myFavoriteNumber = 21;
        System.out.println(myFavoriteNumber);
        String myString = "string value";
        System.out.println(myString);
        double myNumber = 3.14;
        //long is wider version of int, where double or float allow for decimal values
        System.out.println(myNumber);
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
        //It is similar to js where the increment is pre or post
        //int class = 4; does not work class is already a thing in java
        String theNumberThree = "three";
        Object o = theNumberThree;
        //int three = (int) "three";
        //Strings and objects can't be converted to int
        int x = 4;
        x += 5;
        x = 3;
        int y = 4;
        y *= x;
        x = 10;
        y = 2;
        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);
        int maxNum = Integer.MAX_VALUE;
        System.out.println(maxNum);
    }
}
