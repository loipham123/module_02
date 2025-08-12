package ep_kieu;

public class Main {
    public static void main(String[] args) {
        HocVien hocVien1 = new ChuyenVien();
        HocVien hocVien2 = hocVien1;
        ChuyenVien hocVien3 = (ChuyenVien) hocVien2;
        NVChinhThuc hocVien4 = hocVien3;
        HocVien hocVien5 = hocVien3;
        HocVien hocVien6 = (HocVien) hocVien2;
        HocVien hocVien7 = (NVQuanLy) hocVien6;
        NVChinhThuc hocVien8 = (NVChinhThuc) hocVien7;
//        SinhVien hocVien9 = (SinhVien) hocVien3;
        HocVien hocVien10 = new SinhVien();
        ChuyenVien hocVien11 = (ChuyenVien) hocVien10;
    }
}
