package set_practice;

import java.util.*;

import static java.util.stream.Collectors.toList;

public class SetPractice {
    static Scanner sc = new Scanner(System.in);

    //a. Loại bỏ các phần tử trùng lặp
    public static void removeDuplicates() {
        int arr[] = inputArray();
        Set<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }
        System.out.println("Các phần tử duy nhất: " + set);
    }

    //b. Tính tổng của các phần tử không trùng lặp
    public static void sumUniqueElements(){
        int arr[] = inputArray();
        Set<Integer> set = new HashSet<>();

        for(int num :arr){
            set.add(num);
        }
        int sum=0;
        for(int num : set){
            sum +=num;
        }
        System.out.println("Tổng các phần tử không trùng lặp: " + sum);
    }
    // c. Tìm phần tử chung giữa 2 mảng
    public static Set<Integer> findCommonElements(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int num : arr2) {
            set2.add(num);
        }

        set1.retainAll(set2);
        return set1;
    }
    //d.Tìm phần tử lớn nhất và nhỏ nhất
    public static void findMinMax() {
        int[] arr = inputArray();

        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int min = Collections.min(set);
        int max = Collections.max(set);

        System.out.println("Phần tử nhỏ nhất: " + min);
        System.out.println("Phần tử lớn nhất: " + max);
    }

    //Input array
    public static int[] inputArray() {
        System.out.println("Nhập số lượng phẩn tử: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + (i + 1) + "]: ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
