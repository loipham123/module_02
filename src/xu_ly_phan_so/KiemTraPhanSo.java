package xu_ly_phan_so;

public class KiemTraPhanSo {
    public static void main(String[] args) {
        PhanSo phanSo01 = new PhanSo();
        PhanSo phanSo02 = new PhanSo();

        System.out.println("Nhap phan so thu nhat:");
        phanSo01.input();

        System.out.println("Nhap phan so tu hai:");
        phanSo02.input();

        System.out.print("Phan so thu nhat: ");
        phanSo01.output();
        System.out.print("Phan so thu hai");
        phanSo02.output();

        System.out.print("Tong 2 phan so: ");
        PhanSo tong = phanSo01.cong(phanSo02);
        tong.output();

        System.out.print("Hieu 2 phan so:");
        PhanSo hieu = phanSo01.hieu(phanSo02);
        hieu.output();

        System.out.print("Tich 2 phan so: ");
        PhanSo tich = phanSo01.nhan(phanSo02);
        tich.output();

        System.out.print("Thuong 2 phan so: ");
        PhanSo thuong = phanSo01.hieu(phanSo02);
        thuong.output();

        System.out.println("Phan so thu nhat la phan so " + (phanSo01.laPhanSoDuong() ? "duong" : "am") + ".");
        System.out.println("Phan so thu hai la phan so " + (phanSo02.laPhanSoDuong() ? "duong" : "am" )+ ".");

        System.out.println("Phan so thu nhat "+(phanSo01.laPhanSoKhong() ? "= 0":"khong = 0"+ "."));
        System.out.println("Phan so thu hai "+(phanSo02.laPhanSoKhong() ? "= 0":"khong = 0"+ "."));

    }
}
