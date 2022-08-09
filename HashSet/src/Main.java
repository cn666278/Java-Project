import java.util.HashSet;
/*
* HashSet 基于 HashMap 来实现的，是一个不允许有重复元素的集合。
* HashSet 允许有 null 值。
* HashSet 是无序的，即不会记录插入的顺序。
* HashSet 不是线程安全的， 如果多个线程尝试同时修改 HashSet，则最终结果是不确定的。您必须在多线程访问时显式同步对 HashSet 的并发访问。
* HashSet 实现了 Set 接口。
* */
public class Main {
    public static void main(String[] args) {
        HashSet<String> sites = new HashSet<String>();
        sites.add("Google");
        sites.add("Oracle");
        sites.add("Alibaba");
        sites.add("Twitter");
        sites.add("Oracle");  // 重复的元素不会被添加

        System.out.println(sites);

        // 删除元素，删除成功返回 true，否则为 false
        sites.remove("Alibaba");

        // 判断元素是否存在
        System.out.println("The sites contain Google? -" + sites.contains("Google"));

        // delete all items
        sites.clear();
        System.out.println(sites);
    }
}