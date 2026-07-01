package Map的遍历;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map2 {
    static void main() {
        Map<String,String> map = new HashMap<>();

        map.put("1男","1女");
        map.put("2男","2女");
        map.put("3男","3女");
        //获取所有的键值对对象
        //set集合中装的是键值对对象（entry对象）
         //而entry里面装的是键和值，泛型嵌套
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            //得到每一个键值对对象

            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "-" + value);
        }

    }
}
