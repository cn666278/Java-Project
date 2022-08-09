public class Main {
    public static void main(String[] args) {
        // Create a circle with radius 5.0
        Circle myCircle = new Circle(5.0);
        System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());

        // Increase myCircle's radius by 10%
        myCircle.setRadius(myCircle.getRadius() * 1.1);
        System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());

        System.out.println("The number of objects created is " + Circle.getNumberOfObjects());
        // 注意只能使用Circle.getNumberOfObjects() ,因为实例化之后无法访问static函数: getNumberOfObjects()
        // 返回值为1，因为仅仅实例化了一次 Circle(myCircle)

        printCircle(myCircle);

        /* Array Objects */
        Circle[] circleArray;
        circleArray = createCircleArray();
        printCircle(circleArray);
    }

    public static void printCircle(Circle[] circleArray) {
        System.out.println("_______________________________________________________");
        System.out.printf("%-30s%-15s\n","Radius","Area");
        for (int i = 0 ; i < circleArray.length; i++){
            System.out.printf("%-30.2f%-15.4f\n",circleArray[i].getRadius(),circleArray[i].getArea());
        }

        System.out.println("_______________________________________________________");
        // Compute and display the result
        System.out.printf("%-30s%-15.4f\n","The total area of circles is", sum(circleArray));
    }

    public static double sum(Circle[] circleArray) {
        double sum = 0;

        for (int i = 0; i < circleArray.length; i++){
            sum += circleArray[i].getArea();
        }
        return sum;
    }

    public static Circle[] createCircleArray() {
        Circle[] circleArray = new Circle[5];

        for (int i = 0; i < circleArray.length; i++){
            circleArray[i] = new Circle(Math.random() * 100);
        }

        return circleArray;
    }

    /* Passing object to method */
    public static void printCircle(Circle c){
        System.out.println("The area of the circle of radius " + c.getRadius() + " is " + c.getArea());
        System.out.println("The number of objects created is " + Circle.getNumberOfObjects());
    }
}