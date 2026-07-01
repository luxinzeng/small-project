package Map的遍历;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map1 {
    static void main() {
        Map<String,String> map = new HashMap<>();
        //1
        map.put("1男","1女");
        map.put("2男","2女");
        map.put("3男","3女");
        //获取所有的键
        Set<String> keys = map.keySet();
        // 遍历set集合得到每一个值
        for (String key : keys) {
            String value = map.get(key);
            System.out.println(key + "-" + value);
        }
    }
}
