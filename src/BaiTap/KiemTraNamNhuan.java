package BaiTap;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhạp nam can kiem tra: ");
        int nam = scanner.nextInt();
        if((nam % 4 ==0 && nam % 100 != 0) || (nam % 400 == 0)){
            System.out.println( nam + " La nam nhuan");
        } else {
            System.out.println(nam + " Khong la nam nhuan");
        }
        scanner.close();

    }
}
