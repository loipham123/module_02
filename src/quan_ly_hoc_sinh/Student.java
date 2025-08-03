package quan_ly_hoc_sinh;

import java.util.Scanner;

public class Student {
    String ten;
    double diemToan;
    double diemVan;

    void input(){
        Scanner sc= new Scanner(System.in);

        System.out.print("Nhập tên: ");
        ten = sc.nextLine();

        System.out.print("Nhập điểm toán: ");
        diemToan=Double.parseDouble(sc.nextLine());

        System.out.print("Nhập điểm văn: ");
        diemVan=Double.parseDouble(sc.nextLine());
    }
    double tinhDiemTb(){
        return (diemToan+diemVan)/2;
    }
    void output(){
        System.out.println("Tên: " + ten);
        System.out.println("Điểm Toán: " + diemToan);
        System.out.println("Điểm Văn: " + diemVan);
        System.out.println("Điểm Trung Bình: "+tinhDiemTb());
    }
}

