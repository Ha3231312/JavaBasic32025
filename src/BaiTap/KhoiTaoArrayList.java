package BaiTap;

import java.util.ArrayList;
import java.util.Arrays;

public class KhoiTaoArrayList {
    public static void main(String[] args) {

        //Khoi tao rong  + add
        ArrayList<String> name = new ArrayList<>();
        name.add("Ha");
        name.add("Hong");
        System.out.println(name);

        //Khoi tao phan tu ngay lap tuc su dung array.aslist
        ArrayList<String> name1 = new ArrayList<>(Arrays.asList("Nhung", "Lan"));
        System.out.println(name1);

        //Khởi tạo với kích thước cố định

        ArrayList<Integer> name2 = new ArrayList<>(3);
        name2.add(6);
        name2.add(2);
        System.out.println(name2);


    }

}

