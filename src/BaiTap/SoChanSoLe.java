package BaiTap;

import java.util.Scanner;

public class SoChanSoLe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap mot so nguyen");
        int number = scanner.nextInt();
        if (number % 2 == 0){
            System.out.println(number + " La so chan");
        }else {
            System.out.println(number + " La so le");
        }
    }
}
