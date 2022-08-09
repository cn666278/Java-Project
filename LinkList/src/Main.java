import java.util.LinkedList;

/*
* 以下情况使用 LinkedList :
* 你需要通过循环迭代来访问列表中的某些元素。
* 需要频繁的在列表开头、中间、末尾等位置进行添加和删除元素操作。
*/
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(7);

        // add item at the index 1
        linkedList.add(1,114514);

        // add item at the head
        linkedList.addFirst(-9);

        System.out.println(linkedList);

        // remove item from head
        linkedList.removeFirst();

        System.out.println(linkedList);

        System.out.println("The first item is " + linkedList.getFirst());

        for (int num: linkedList)
            System.out.print(num);
        System.out.println();
    }
}