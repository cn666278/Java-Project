
import java.util.HashMap;
import java.util.Map;
/*
* HashMap 是一个散列表，它存储的内容是键值对(key-value)映射。

* HashMap 实现了 Map 接口，根据键的 HashCode 值存储数据，具有很快的访问速度，最多允许一条记录的键为 null，不支持线程同步。

* HashMap 是无序的，即不会记录插入的顺序。

* HashMap 继承于AbstractMap，实现了 Map、Cloneable、java.io.Serializable 接口。
*/

/*
* HashMap 的 key 与 value 类型可以相同也可以不同，
* 可以是字符串（String）类型的 key 和 value:
* HashMap<String, String> Sites = new HashMap<String, String>();
*
* 也可以是整型（Integer）的 key 和字符串（String）类型的 value:
* HashMap<Integer, String> Sites = new HashMap<Integer, String>();
* */
public class Main {
    public static void main(String[] args) {
        // 创建 HashMap 对象 sites
        HashMap<Integer, String> sites = new HashMap<Integer, String>();
        // 添加键值对
        sites.put(1, "Google");
        sites.put(2, "Alibaba");
        sites.put(3, "Oracle");
        sites.put(4, "Twitter");
        System.out.println("sites HashMap: " + sites);

        // 创建另一个 HashMap
        HashMap<Integer, String> sites2 = new HashMap<>();
        sites2.put(1, "Weibo");  // sites2 中的key如果 sites 已存在会被替换
        sites2.put(5, "Wiki");
        sites2.put(6, "Wix");

        // 将所有的映射关系从 sites 添加到 sites2
        sites2.putAll(sites);
        System.out.println("sites2 HashMap: " + sites2);

        // get the value using key
        System.out.println(sites.get(3));

        // add value using key
        sites.put(5,"ByteDance");

        // 判断指定的键（key）是否存在，不存在则将键/值对插入到 HashMap 中。
        sites.putIfAbsent(7, "BiliBili"); // HashMap 不存在该key,插入
        sites.putIfAbsent(2, "Wiki");  // HashMap 中存在 Key，不执行插入
        System.out.println("Updated sites: " + sites);

        // delete value suing key
        sites.remove(2);
        System.out.println(sites);

        // replace key and value
        sites.replace(4,"Tumblr");
//        sites.put(4,"Tumblr");
        System.out.println(sites);

        // check key
        if(sites.containsKey(1)) {
            System.out.println("key 1 is in sites");
        }

        // check value
        if(sites.containsValue("Google")) {
            System.out.println("Google is in sites");
        }

        // 输出 key 和 value
        for (int i : sites.keySet()) {
            System.out.println("key: " + i + " value: " + sites.get(i));
        }
        // 输出每一个value
        for(String value: sites.values()) {
            System.out.print(value + " ");
        }

        sites.clear();
        System.out.println("\nThe hashmap is empty? " + sites.isEmpty());

    }
}