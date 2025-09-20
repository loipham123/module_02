package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KiemTraTenDuyNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập danh sách tên: ");
        String input = sc.nextLine();

        String[] names = input.split(" ");
        Map<String, Integer> nameCount = new HashMap<>();

        for (String name : names) {
            if (nameCount.containsKey(name)) {
                int count = nameCount.get(name);
                nameCount.put(name, count + 1);
            } else {
                nameCount.put(name, 1);
            }
        }

        System.out.println("\nKết quả kiểm tra tên:");
        for (String key : nameCount.keySet()) {
            int count = nameCount.get(key);
            if (count == 1) {
                System.out.println(key + " là tên duy nhất.");
            } else {
                System.out.println(key + " xuất hiện " + count + " lần.");
            }
        }
    }
}
