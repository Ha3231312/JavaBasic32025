package BaiTap;

import java.util.Scanner;

public class SoLonNhat {
    public static void main(String[] args) {

        //Bai 1
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE; // Khởi tạo max với giá trị nhỏ nhất có thể

        System.out.print("Nhập số lượng số cần so sánh: ");
        int n = scanner.nextInt(); // Người dùng nhập số lượng số cần so sánh

        for (int i = 1; i <= n; i++) {
            System.out.print("Nhập số thứ " + i + ": ");
            int number = scanner.nextInt();
            max = Math.max(max, number); // Cập nhật số lớn nhất
        }

        System.out.println("Số lớn nhất là: " + max);
        scanner.close(); // Đóng Scanner

        //Bai 2

        int[] numbers1 = {10, 25, 8, 42, 30}; // Mảng số nguyên
        int max1 = Integer.MIN_VALUE; // Gán giá trị nhỏ nhất có thể

        for (int number : numbers1) {
            max1 = Math.max(max1, number); // Cập nhật giá trị lớn nhất
        }

        System.out.println("Số lớn nhất là: " + max1);
    }
}


