package ke_thua;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static ArrayList<OldPhone> oldPhones = new ArrayList<>();
    static ArrayList<NewPhone> newPhones = new ArrayList<>();
    static ArrayList<Phone> phones = new ArrayList<>();

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
            } while (choose < 1 || choose > 5);
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
                        break;
                    case 2:
                        System.out.println("-- Danh Sách Điện Thoại Cũ --");
                        int count = 1;
                        for (Phone phone : phones) {
                            if (phone instanceof OldPhone) {
                                System.out.println("Thông tin điện thoại thứ: " + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 3:
                        System.out.println("-- Danh Sách Điện Thoại Mới --");
                        count = 1;
                        for (Phone phone : phones) {
                            if (phone instanceof NewPhone) {
                                System.out.println("Thông tin điện thoại thứ: " + count++);
                                phone.output();
                            }
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

    private static void menuAddNew() {
        int choose;
        while (true) {
            do {
                System.out.println("--Thêm điện thoại mới--");
                System.out.println("1. Thêm mới điện thoại cũ");
                System.out.println("2. Thêm mới điện thoại mới");
                System.out.println("3. Trở về menu chính");

                System.out.print("Mời bạn lựa chọn: ");
                choose = Integer.parseInt(sc.nextLine());

                switch (choose) {
                    case 1:
                        OldPhone oldPhone = new OldPhone();
                        oldPhone.input();
                        oldPhone.setId(getIdOldPhone());
                        phones.add(oldPhone);
                        System.out.println("Thêm thành công");
                        break;
                    case 2:
                        NewPhone newPhone = new NewPhone();
                        newPhone.input();
                        newPhone.setId(getIdNewPhone());
                        phones.add(newPhone);
                        System.out.println("Thêm thành công");
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ");
                }
            } while (choose < 1 || choose > 3);
        }
    }

    private static String getIdOldPhone() {
        ArrayList<OldPhone> oldPhones = getOldPhones();
        if (oldPhones.size() == 0) {
            return "DT001";
        }
        int max = Integer.parseInt(oldPhones.get(0).getId().substring(3));

        for (int i = 1; i < oldPhones.size(); i++) {
            int id = Integer.parseInt(oldPhones.get(i).getId().substring(3));
            if (max < id) {
                max = id;
            }
        }
        return String.format("DTC%3d", max + 1).replace(" ", "0");
    }

    private static ArrayList<OldPhone> getOldPhones() {
        ArrayList<OldPhone> oldPhones = new ArrayList<>();
        for (Phone phone : phones) {
            if (phone instanceof OldPhone) {
                oldPhones.add((OldPhone) phone);
            }
        }
        return oldPhones;
    }

    private static ArrayList<NewPhone> getNewPhones() {
        ArrayList<NewPhone> newPhones = new ArrayList<>();
        for (Phone phone : phones) {
            if (phone instanceof NewPhone) {
                newPhones.add((NewPhone) phone);
            }
        }
        return newPhones;
    }

    private static String getIdNewPhone() {
        ArrayList<NewPhone> newPhones = getNewPhones();
        if (newPhones.size() == 0) {
            return "DT001";
        }
        int max = Integer.parseInt(newPhones.get(0).getId().substring(3));

        for (int i = 1; i < newPhones.size(); i++) {
            int id = Integer.parseInt(newPhones.get(i).getId().substring(3));
            if (max < id) {
                max = id;
            }
        }
        return String.format("DTM%3d", max + 1).replace(" ", "0");
    }

    private static void update() {
        System.out.print("Nhập vào mã muốn cập nhật: ");
        String id = sc.nextLine();

        if (id.startsWith("DTC")) {
            boolean isExistPhone = false;
            for (OldPhone oldPhone : oldPhones) {
                if (oldPhone.getId().equals(id)) {
                    isExistPhone = true;
                    oldPhone.input();
                    System.out.println("Cập nhật thành công");
                    break;
                }
            }
            if (!isExistPhone) {
                System.out.println("Không tìm thấy mã muốn cập nhật");
            }
        } else if (id.startsWith("DTM")) {
            boolean isExistPhone = false;
            for (NewPhone newPhone : newPhones) {
                if (newPhone.getId().equals(id)) {
                    isExistPhone = true;
                    newPhone.input();
                    System.out.println("Cập nhật thành công");
                    break;
                }
            }
            if (!isExistPhone) {
                System.out.println("Không tim thấy mã muốn cập nhật");
            }
        } else {
            System.out.println("Mã không hợp lệ");
        }
    }

    private static void delete() {
        System.out.print("Nhập mã muốn xóa: ");
        String id = sc.nextLine();


        if (id.startsWith("DTC")) {
            boolean isExistPhone;
            isExistPhone = false;
            for (OldPhone oldPhone : oldPhones) {
                isExistPhone = true;
                System.out.printf("Bạn có xóa điẹn thoại có mã %s không\n");
                System.out.println("Chọn Yes để xác nhận xóa, No để hủy");
                if ("yes".equalsIgnoreCase(sc.nextLine())) {
                    oldPhones.remove(oldPhone);
                    System.out.println("Xóa thành công");
                } else {
                    System.out.println("Đã hủy việc xóa");
                }
                break;
            }
            if (!isExistPhone) {
                System.out.println("Không tìm thấy mã muốn xóa");
            }
        } else if (id.startsWith("DTM")) {
            boolean isExistPhone = false;
            for (NewPhone newPhone : newPhones) {
                if (id.startsWith("DTM")) {
                    isExistPhone = false;
                    for (OldPhone oldPhone : oldPhones) {
                        isExistPhone = true;
                        System.out.printf("Bạn có xóa điẹn thoại có mã %s không\n");
                        System.out.println("Chọn Yes để xác nhận xóa, No để hủy");
                        if ("yes".equalsIgnoreCase(sc.nextLine())) {
                            oldPhones.remove(oldPhone);
                            System.out.println("Xóa thành công");
                        } else {
                            System.out.println("Đã hủy việc xóa");
                        }
                        break;
                    }
                }
                if (!isExistPhone) {
                    System.out.println("Không tìm thấy mã muốn xóa");
                } else {
                    System.out.println("Mã không hợp lệ");
                }
            }
        }
    }

    private static void menuSort() {
        int choose;
        while (true) {
            do {
                System.out.println("--Sắp xếp điện thoại theo giá--");
                System.out.println("1. Tăng dần");
                System.out.println("2. Giảm dần");
                System.out.println("Trở về menu chính");

                System.out.println("Mời bạn chọn");
                choose = Integer.parseInt(sc.nextLine());

                switch (choose) {
                    case 1:
                        for (int i = 0; i < phones.size(); i++) {
                            for (int j = i + 1; j < phones.size(); j++) {
                                if (phones.get(i).getPrice() > phones.get(j).getPrice()) {
                                    Phone temp = phones.get(i);
                                    phones.set(i, phones.get(j));
                                    phones.set(j, temp);
                                }
                            }
                        }
                        break;
                    case 2:
                        for (int i = 0; i < phones.size() - 1; i++) {
                            for (int j = i + 1; j < phones.size(); j++) {
                                if (phones.get(i).getPrice() < phones.get(j).getPrice()) {
                                    Phone temp = phones.get(i);
                                    phones.set(i, phones.get(j));
                                    phones.set(j, temp);
                                }
                            }
                        }
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ");
                }
            } while (choose < 1 || choose > 3);
        }
    }

    private static void menuSearch() {
        int choose;
        while (true) {
            do {
                System.out.println("--Tìm kiếm điện thoại--");
                System.out.println("1. Tìm kiếm tất cả điện thoại");
                System.out.println("2. Tìm kiếm điện thoại cũ");
                System.out.println("3. Tìm kiếm điện thoại mới");
                System.out.println("4. Trở về menu chính");

                System.out.print("Mời bạn chọn:");
                choose = Integer.parseInt(sc.nextLine());

                switch (choose) {
                    case 1:
                        menuSearchAllPhone();
                        break;
                    case 2:
                        menuSearchOldPhone();
                        break;
                    case 3:
                        menuSearchNewPhone();
                    case 4:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ");
                }
            } while (choose < 1 || choose > 4);
        }
    }

    private static void menuSearchAllPhone() {
        int choose;
        while (true) {
            do {
                System.out.println("--Tìm kiếm tất cả điện thoại--");
                System.out.println("1. Tìm kiếm theo giá");
                System.out.println("2. Tìm kiếm theo tên");
                System.out.println("3. Tìm kiếm theo hãng");
                System.out.println("4. Trở về menu tìm kiếm");

                System.out.println("Mời bạn chọn:");
                choose = Integer.parseInt(sc.nextLine());

                switch (choose) {
                    case 1:
                        System.out.println("Nhập vào khoảng giá muốn tìm");
                        System.out.print("Nhập giá từ: ");
                        int priceFrom = Integer.parseInt(sc.nextLine());

                        System.out.print("Nhập giá đến: ");
                        int priceTo = Integer.parseInt(sc.nextLine());

                        int count = 1;
                        for (Phone phone : phones) {
                            if (phone.getPrice() >= priceFrom && phone.getPrice() <= priceTo) {
                                System.out.println("Thông tin điện thoại thứ " + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 2:
                        System.out.print("Nhập vào tên muốn tìm: ");
                        String name = sc.nextLine();
                        count = 1;
                        for (Phone phone : phones) {
                            if (phone.getName().contains(name)) {
                                System.out.println("Thông tin điện thoại thứ " + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 3:
                        System.out.print("Nhập hãng điện thoại muốn tìm: ");
                        String manufacturer = sc.nextLine();
                        count = 1;
                        for (Phone phone : phones) {
                            if (phone.getManufacturer().contains(manufacturer)) {
                                System.out.println("Thông tin điện thoại thứ " + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 4:
                        return;
                    default:
                        System.out.print("Lựa chọn không hợp lệ");
                }
            } while (choose < 1 || choose > 4);
        }
    }

    private static void menuSearchOldPhone() {
        int choose;
        while (true) {
            do {
                ArrayList<OldPhone> oldPhones = getOldPhones();
                System.out.println("--Tìm kiếm điện thoại cũ--");
                System.out.println("1. Tìm kiếm theo giá");
                System.out.println("2. Tìm kiếm theo tên");
                System.out.println("3. Tìm kiếm theo hãng");
                System.out.println("4. Trở về menu tìm kiếm");

                System.out.println("Mời bạn chọn:");
                choose = Integer.parseInt(sc.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Nhập vào khoảng giá muốn tìm");
                        System.out.print("Nhập giá từ: ");
                        int priceFrom = Integer.parseInt(sc.nextLine());

                        System.out.print("Nhập giá đến: ");
                        int priceTo = Integer.parseInt(sc.nextLine());
                        int count = 1;
                        for (Phone phone : phones) {
                            if (phone.getPrice() >= priceFrom && phone.getPrice() <= priceTo) {
                                System.out.println("Thông tin điện thoại thứ " + count++);
                                phone.output();
                            }
                        }

                        break;
                    case 2:
                        System.out.print("Nhập vào tên muốn tìm: ");
                        String name = sc.nextLine();
                        count = 1;
                        for (Phone phone : phones) {
                            if (phone.getName().contains(name)) {
                                System.out.println("Thông tin điện thoại thứ " + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 3:
                        System.out.print("Nhập hãng điện thoại muốn tìm: ");
                        String manufacturer = sc.nextLine();
                        count = 1;
                        for (Phone phone : phones) {
                            if (phone.getManufacturer().contains(manufacturer)) {
                                System.out.println("Thông tin điện thoại thứ " + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 4:
                        return;
                    default:
                        System.out.print("Lựa chọn không hợp lệ");
                }
            } while (choose < 1 || choose > 4);
        }
    }

    private static void menuSearchNewPhone() {
        int choose;
        while (true) {
            do {
                System.out.println("--Tìm kiếm điện thoại mới--");
                System.out.println("1. Tìm kiếm theo giá");
                System.out.println("2. Tìm kiếm theo tên");
                System.out.println("3. Tìm kiếm theo hãng");
                System.out.println("4. Trở về menu tìm kiếm");

                System.out.println("Mời bạn chọn:");
                choose = Integer.parseInt(sc.nextLine());

                switch (choose) {
                    case 1:
                        System.out.println("Nhập vào khoảng giá muốn tìm");
                        System.out.print("Nhập giá từ: ");
                        int priceFrom = Integer.parseInt(sc.nextLine());

                        System.out.print("Nhập giá đến: ");
                        int priceTo = Integer.parseInt(sc.nextLine());
                        int count = 1;
                        for (Phone phone : phones) {
                            if (phone.getPrice() >= priceFrom && phone.getPrice() <= priceTo) {
                                System.out.println("Thông tin điện thoại thứ " + count++);
                                phone.output();
                            }
                        }

                        break;
                    case 2:
                        System.out.print("Nhập vào tên muốn tìm: ");
                        String name = sc.nextLine();
                        count = 1;
                        for (Phone phone : phones) {
                            if (phone.getName().contains(name)) {
                                System.out.println("Thông tin điện thoại thứ " + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 3:
                        System.out.print("Nhập hãng điện thoại muốn tìm: ");
                        String manufacturer = sc.nextLine();
                        count = 1;
                        for (Phone phone : phones) {
                            if (phone.getManufacturer().contains(manufacturer)) {
                                System.out.println("Thông tin điện thoại thứ " + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 4:
                        return;
                    default:
                        System.out.print("Lựa chọn không hợp lệ");
                }
            } while (choose < 1 || choose > 4);
        }
    }

}
