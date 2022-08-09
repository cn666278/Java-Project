import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Display the header of the table
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n","Degrees","Radians","Sine","Cosine","Tangent");

        // Display values for input degrees
        int[] degrees = new int[4];
        for (int i = 0; i < 4; i++) {
            degrees[i] = input.nextInt();
            double radians = Math.toRadians(degrees[i]);
            System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees[i], radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));
        }
    }
}