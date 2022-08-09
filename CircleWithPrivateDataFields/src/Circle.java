public class Circle {
    private double radius = 1; //无法从class外部修改和访问

    /* The number of objects created */
    private static int numberOfObjects = 0; // static：共享变量

    /* Construct a circle with radius 1 */
    public Circle(){
        numberOfObjects++;
    }

    /* Construct a circle with a specified radius */
    public Circle(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }

    /* Return radius */
    public double getRadius(){
        return radius;
    }

    /* Set a new radius */
    public void setRadius(double newRadius){
        radius = (newRadius >= 0) ? newRadius : 0;
    }

    /* Return number of objects */
    public static int getNumberOfObjects(){
        return numberOfObjects;
    }

    /* Return the area of this circle */
    public double getArea(){
        return Math.sqrt(radius) * Math.PI;
    }
}
