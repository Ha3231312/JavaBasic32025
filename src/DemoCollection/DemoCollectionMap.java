package DemoCollection;

import java.util.HashMap;
import java.util.Map;

public class DemoCollectionMap {
    public static void main(String[] args) {
        //Khai bao kieu du lieu map
        //Khong luu duoc 2 key trung lap
        Map<String, String> map1 = new HashMap<>();
        Map<Integer, Double> map2 = new HashMap<>();


        // Them du lieu
        map1.put("language","Java");
        map1.put("framwork","TestNG");
        map1.put("library","Selenium");

        map2.put(1, 111D);
        map2.put(2,111D);

        System.out.println("Map 1: " + map1);
        System.out.println("Map 2: " + map2);

        //Update value
        map1.put("library", "Playwright");

        System.out.println(map1.containsKey("language"));
        System.out.println(map1.containsValue("Java"));
        //map1.remove("library");

        //Duyet kieu du lieu Map
        //Get het gia tri của key va value

        for (Map.Entry<String, String> entry : map1.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        for (Map.Entry<Integer, Double> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
