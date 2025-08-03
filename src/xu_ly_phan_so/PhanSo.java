package xu_ly_phan_so;

import java.util.Scanner;

public class PhanSo {
    double soTu;
    double soMau;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập sô tử: ");
        soTu = Double.parseDouble(sc.nextLine());

        do {
            System.out.print("Nhập số mẫu (khác 0): ");
            soMau = Double.parseDouble(sc.nextLine());
            if(soMau == 0){
                System.out.println("Nhap mau so khac 0");
            }
        } while (soMau == 0);

    }

    double timUCLN(double a, double b) {
        if (a == 0 || b == 0) {
            return 1;
        }
        for (double i = a; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    void rutGon() {
        double ucln = timUCLN(soTu, soMau);
        soTu /= ucln;
        soMau /= ucln;

        if (soMau < 0) {
            soTu = -soTu;
            soMau = -soMau;
        }
    }

    void output() {
        rutGon();
        if (soMau == 1) {
            System.out.println(soTu);
        } else {
            System.out.println(soTu + "/" + soMau);
        }
    }

    //tổng 2 phân số
    PhanSo cong(PhanSo phanSoKhac) {
        PhanSo ketQua = new PhanSo();
        ketQua.soTu = this.soTu * phanSoKhac.soMau + phanSoKhac.soTu*this.soMau;
        ketQua.soMau= this.soMau * phanSoKhac.soMau;
        return ketQua;
    }
    PhanSo hieu(PhanSo phanSoKhac){
        PhanSo ketQua= new PhanSo();
        ketQua.soTu=this.soTu * phanSoKhac.soMau - phanSoKhac.soTu*this.soMau;
        ketQua.soMau=this.soMau*phanSoKhac.soMau;
        return ketQua;
    }

    PhanSo nhan(PhanSo phanSoKhac){
        PhanSo ketQua = new PhanSo();
        ketQua.soTu=this.soTu * phanSoKhac.soTu;
        ketQua.soMau=this.soMau * phanSoKhac.soMau;
        return ketQua;
    }

    PhanSo chia(PhanSo phanSoKhac){
        PhanSo ketQua =new PhanSo();
        ketQua.soTu= this.soTu * phanSoKhac.soMau;
        ketQua.soMau=this.soMau * phanSoKhac.soTu;
        return ketQua;
    }

    boolean laPhanSoDuong(){
        return soTu*soMau > 0 || soTu == 0;
    }
    boolean laPhanSoKhong(){
        return soTu == 0;
    }
}
