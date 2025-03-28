package BaiTap;

import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = number.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần từ thứ " + (i + 1) + " :");
            arr[i] = number.nextInt();
        }
        System.out.println("Mang vua nhap: ");
        for (int num : arr) {
            System.out.print(num + " ");

        }


    }}
