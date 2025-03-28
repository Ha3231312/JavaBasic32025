package DemoCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoCollectionSet {
    public static void main(String[] args) {

        //Khai bao kieu du lieu set
        //Khong luu du lieu trung lap
        Set<String> menu = new HashSet<>();

        //Them du lieu
        menu.add("Dashboard");
        menu.add("Customer");
        menu.add("Project");
        menu.add("Task");
        menu.add("Sales");


        System.out.println(menu.contains("Task1111111111"));
        System.out.println((menu.remove("Sales")));
        System.out.println((menu.size()));
        System.out.println("Cac phan tu cua Set");
        System.out.println("\t" + menu + "\n");

        //Duyet gia tri song set
        Iterator<String> itr = menu.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next() + ", ");
        }
        // Show set through for each
        System.out.println("\n----------------------");
        for (String obj : menu){
            System.out.println(obj + ", ");
        }

    }
}
