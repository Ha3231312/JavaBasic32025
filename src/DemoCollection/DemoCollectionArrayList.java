package DemoCollection;

import java.util.*;

public class DemoCollectionArrayList {
    public static void main(String[] args) {

        //Khai bao kieu du lieu map
        //Duoc phep luu nhieu gia tri trung lap
        List<String> menu = new ArrayList<String>();




        // Them du lieu
        menu.add("Dashboard");
        menu.add("Customer");
        menu.add("Project");
        menu.add("Task");
        menu.add("Sales");
        menu.add("Customer");
        menu.add("Project");






        //Xoa du lieu
        menu.remove(3);


        //Update value
        menu.add(3,"Task123");

        //Get giá trị theo chỉ mục
        System.out.println(menu.get(4));


        //Kiem tra du lieu
        System.out.println(menu.contains("Dashboard"));


        //Duyet kieu du lieu ArrayList
        for (int i = 0; i < menu.size(); i++){
            System.out.println(menu.get(i));
        }

        System.out.println("========================================");


        int J = 0;
        for (String value : menu){
            System.out.println(menu.get(J));
            J++;
        }

        System.out.println("**************************************");

        List<String> menu2 = new ArrayList<>();
        menu2.addAll(menu); //Thêm nguyên bộ data menu vào menu2
        for (int i = 0; i < menu2.size(); i++){
            System.out.println(menu2.get(i));


        }}
    }





