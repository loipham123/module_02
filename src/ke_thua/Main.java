package ke_thua;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static ArrayList<OldPhone> oldPhones = new ArrayList<>();
    static ArrayList<NewPhone> newPhones = new ArrayList<>();

    static {
        //thêm điện thoại cũ
        oldPhones.add(new OldPhone("DTC001", "Iphone 13", 14000.0, 6, "Apple",
                98, "Đã qua sử dụng"));

        oldPhones.add(new OldPhone("DTC002", "Iphone 15", 16000.0, 12, "Apple",
                98, "Hàng new"));

        //thêm điện thoại mới
        newPhones.add(new NewPhone("DTM001", "SamSung Note 5 Plus", 10000.0, 12, "SamSung", 30));

        newPhones.add(new NewPhone("DTM002", "SamSung S22 Ultra", 25000.0, 6, "SamSung", 20));
    }

    public static void main(String[] args) {
        int choose;
        while (true) {
            do {
                System.out.println("-- Chương Trình Quản Lý Điện Thoại --");
                System.out.println("1. Xem danh sách điện thoại");
                System.out.println("2. Thêm mới");
                System.out.println("3. Cập nhật");
                System.out.println("4. Xóa");
                System.out.println("5. Sắp xếp theo giá");
                System.out.println("6. Tìm kiếm");
                System.out.println("7. Tính tổng tiền");
                System.out.println("8. Giảm giá cho điện thoại cũ");
                System.out.println("9. Thoát");

                System.out.println("Mời bạn chọn: ");
                choose = Integer.parseInt(sc.nextLine());

                switch (choose) {
                    case 1:
                        menuShowList();
                        break;
                    case 2:
                        menuAddNew();
                        break;
                    case 3:
                        update();
                        break;
                    case 4:
                        delete();
                        break;
                    case 5:
                        menuSort();
                        break;
                    case 6:
                        menuSearch();
                        break;
                    case 9:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ !!! Xin chọn lại");
                }
                while (choose < 1 || choose > 5) ;
            }
        }
    }

    private static void menuShowList() {
        int choose;
        while (true) {
            do {
                System.out.println("-- Danh Sách Điện Thoại --");
                System.out.println("1. Xem tất cả");
                System.out.println("2. Xem điện thoại cũ");
                System.out.println("3. Xem điện thoại mới");
                System.out.println("4. Trở về menu chính");

                System.out.print("Mời bạn chọn: ");
                choose = Integer.parseInt(sc.nextLine());

                switch (choose) {
                    case 1:
                        System.out.println("-- Danh Sách Tất Cả Điện Thoại --");
                        for (int i = 0; i < oldPhones.size(); i++) {
                            System.out.println("Thông tin điện thoại thứ: " + (i + 1));
                            oldPhones.get(i).output();
                        }
                        for (int i = 0; i < newPhones.size(); i++) {
                        System.out.println("Thông tin điện thoại thứ: " + (i + 1 + oldPhones.size()));
                        newPhones.get(i).output();
                        }
                        break;
                    case 2:
                        System.out.println("-- Danh Sách Điện Thoại Cũ --");
                        for (int i = 0; i < oldPhones.size(); i++) {
                            System.out.println("Thông tin điện thoại thứ: " + (i + 1));
                            oldPhones.get(i).output();
                        }
                        break;
                    case 3:
                        System.out.println("-- Danh Sách Điện Thoại Mới --");
                        for (int i = 0; i < newPhones.size(); i++) {
                            System.out.println("Thông tin điện thoại thứ: " + (i + 1 + oldPhones.size()));
                            newPhones.get(i).output();
                        }
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Lựa chọn chưa hợp lệ, xin chọn lại");
                }
            } while (choose < 0 || choose > 4);
        }
    }
}
