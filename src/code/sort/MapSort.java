package code.sort;



import java.util.*;

/**
 * @author LuSheng
 * @title: MapSort
 * @projectName leetcode
 * @description: TODO
 * @date 2023/8/189:06
 */
public class MapSort {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple",1);
        map.put("banana",2);
        map.put("peach",5);
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue()-o1.getValue();
            }
        });
        for(Map.Entry entry : list){
            System.out.println(entry.getKey() + "       " + entry.getValue());
        }
        List<Map.Entry<String, Integer>> entries = Collections.synchronizedList(list);

    }
}
