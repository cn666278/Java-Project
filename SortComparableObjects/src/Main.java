import java.util.Arrays;
import java.math.*;

/* Sort Comparable Objects */
public class Main {
    public static void main(String[] args) {
        String[] cities = {"Los Angle","Shanghai","Tokyo","Kuala Lumpur"};
        Arrays.sort(cities);

        for (String city: cities)
            System.out.print(city + "   ");
        System.out.println(); // change line

        BigInteger[] hugeNumbers = {
                new BigInteger("17826537243425"),
                new BigInteger("36827385176422"),
                new BigInteger("97162785187267"),
                new BigInteger("78261818212131")
        };
        Arrays.sort(hugeNumbers);

        for (BigInteger number: hugeNumbers)
            System.out.print(number + "   ");
    }

}
