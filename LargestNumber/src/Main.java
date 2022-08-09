import java.util.ArrayList;
import java.math.*;

/* Using ArrayList */
public class Main {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(45);
        list.add(3445.53);
        list.add(new BigInteger("3432738273267263")); // Add a BigInteger
        list.add(new BigDecimal("2.36723626327232")); // Add a BigDecimal

        System.out.println("The largest number is " + getLargestNumber(list));
    }

    private static Number getLargestNumber(ArrayList<Number> list) {
        if (list == null || list.size() == 0)
            return null;

        Number number = list.get(0);
        for (int i = 0; i < list.size(); i++){
            if (number.doubleValue() < list.get(i).doubleValue())
                number = list.get(i);
        }
        return number;
    }
}