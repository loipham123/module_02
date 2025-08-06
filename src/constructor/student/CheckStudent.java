package constructor.student;

/**
 * Xây dựng lớp Student thỏa mãn tính bao đóng
 * Thông tin của học sinh bao gồm:
 *     id: Không được phép chỉnh sửa.
 *     name: Bắt buộc nhập.
 *     score: Phải nằm trong khoảng từ 0 đến 10.
 *     Nếu không thỏa mãn, hiển thị thông báo lỗi và không cho phép cập nhật thông tin.
 *     Gợi ý: id không cài đặt setter, name & score xét điều kiện ở setter.
 */

public class CheckStudent {
    public static void main(String[] args) {
        Student student1= new Student(1,"Pham Phuoc Loi",7.9);

        System.out.println("Thong tin ban dau: ");
        System.out.println("Id: "+student1.getId());
        System.out.println("Ten: "+student1.getName());
        System.out.println("Diem: "+student1.getScore());

        //updateinfo
        student1.setName("Nguyen Van Check");
        student1.setScore(8.3);

        System.out.println("\nThong tin sau khi cap nhat:");
        System.out.println("Id: "+student1.getId());
        System.out.println("Ten: "+student1.getName());
        System.out.println("Diem: "+student1.getScore());
    }
}
