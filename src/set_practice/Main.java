package set_practice;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Loại bỏ các phần tử trùng lặp");
            System.out.println("2. Tính tổng của các phần tử không trùng lặp");
            System.out.println("3. Tìm các phần tử chung của 2 mảng");
            System.out.println("4. Tìm phần tử lớn nhất và nhỏ nhất");
            System.out.println("0. Thoát");
            System.out.print("Mời chọn: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    SetPractice.removeDuplicates();
                    break;
                case 2:
                    SetPractice.sumUniqueElements();
                    break;
                case 3:
                    System.out.println("Nhập mảng thứ nhất:");
                    int[] arr1 = SetPractice.inputArray();
                    System.out.println("Nhập mảng thứ hai:");
                    int[] arr2 = SetPractice.inputArray();
                    System.out.println("Các phần tử chung: " + SetPractice.findCommonElements(arr1, arr2));
                    break;
                case 4:
                    SetPractice.findMinMax();
                    break;
                case 0:
                    System.out.println("Kết thúc chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại.");
            }
        }
    }
}
