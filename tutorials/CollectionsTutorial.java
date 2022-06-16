package tutorials;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionsTutorial {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set.contains(5));

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.remove(3);
        System.out.println(list);

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("IAN", 5);
        map.put("JOE", 6);
        map.put("JIM", 7);
        System.out.println(map.get("IAN"));


    }
}
