import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(2022, 8, 7);
        // Line 9 copies the reference of calendar to calendar1,
        // so calendar and calendar1 point to the same Calendar object
        Calendar calendar1 = calendar;

        // Line 13 creates a new object that is the clone of calendar and assigns the new object’s reference to calendar2.
        // calendar2 and calendar are different objects with the same contents.
        Calendar calendar2 = (Calendar)calendar.clone();

        System.out.println("calendar == calendar1 is " + (calendar == calendar1));          // true
        System.out.println("calendar == calendar2 is " + (calendar == calendar2));          // false
        System.out.println("calendar.equal(calendar1) is " + calendar.equals(calendar1));   // true
        System.out.println("calendar.equal(calendar2) is " + calendar.equals(calendar2));   // true

        /* Clone ArrayLists */
        ArrayList<Double> list1 = new ArrayList<>();
        list1.add(1.5);
        list1.add(2.5);
        list1.add(3.5);
        ArrayList<Double> list2 = (ArrayList<Double>) list1.clone(); // 克隆了一个全新对象 list2
        ArrayList<Double> list3 = list1; // Copies the reference of list1 to list3
        list2.add(4.5);
        list3.remove(1.5);  // Since list1 and list3 point to the same ArrayList

        System.out.println("list1 is " + list1);
        System.out.println("list2 is " + list2);
        System.out.println("list3 is " + list3);
    }
}