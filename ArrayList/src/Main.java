import java.util.ArrayList;
import java.util.Comparator;

/*
* 以下情况使用 ArrayList :
* 频繁访问列表中的某一个元素。
* 只需要在列表末尾进行添加和删除元素操作
* */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        // Add item to arrayList
        arrayList1.add(1);
        arrayList1.add(9);
        arrayList1.add(-1);
        arrayList1.add(7);
        arrayList1.add(99);
        arrayList1.add(114514);

        // Show the items in arrayList1 one by one
        for (int i: arrayList1)
            System.out.print(i + " ");
        System.out.println(); // change line

        // Remove item
        arrayList1.remove(arrayList1.size() - 1); // delete the last item

        // Find value
        if(arrayList1.contains(1))
            System.out.println("1 is in the arrayList1");

        // Access / get the value
        System.out.println("The second item of arrayList1 is " + arrayList1.get(1));

        // Sort the array list (increasing order)
        arrayList1.sort(Comparator.naturalOrder());
        System.out.println("arrayList1 (increasing order): " + arrayList1);

        // Sort the array list (decreasing order)
        arrayList1.sort(Comparator.reverseOrder());
        System.out.println("arrayList1 (decreasing order): " + arrayList1);

        // Remove all items in arrayList1
        arrayList1.clear();
//        arrayList1.removeAll(arrayList1); // 删除arrayList中的某一集合
        System.out.println("arrayList1 (delete all): " + arrayList1);


        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("你干嘛");
        arrayList2.add("~");
        arrayList2.add("哎哟");
        arrayList2.add("~~");
        arrayList2.add("讨厌");
        arrayList2.add("~~");

        for (String str: arrayList2)
            System.out.print(str);
        System.out.println();

        ArrayList<Character> arrayList3 = new ArrayList<Character>();
        arrayList3.add('I');
        arrayList3.add('K');
        arrayList3.add('U');
        arrayList3.add('N');

        for (char ch : arrayList3)
            System.out.print(ch);
        System.out.println();

        // Clone arrayList
        ArrayList<String> arrayList4 = (ArrayList<String>) arrayList2.clone();
        for (String str : arrayList4)
            System.out.print(str);
        System.out.println();

    }
}