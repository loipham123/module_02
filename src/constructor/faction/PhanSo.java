package constructor.faction;

import java.util.Scanner;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo() {
        tuSo = 0;
        mauSo = 1;
    }

    public PhanSo(int tuSo) {
        this.tuSo = tuSo;
        mauSo=1;
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    private void rutGon() {
        int ucln = timUCLN(tuSo, mauSo);
        tuSo /= ucln;
        mauSo /= ucln;

        if (mauSo < 0) {
            tuSo = -tuSo;
            mauSo = -mauSo;
        }
    }

    private int timUCLN(int a, int b) {
        if (a == 0 || b == 0) {
            return 1;
        }
        a = Math.abs(a);
        for (int i = a; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public void xuat() {
        rutGon();
        if (mauSo == 1) {
            System.out.println(tuSo);
        } else {
            System.out.println(tuSo + "/" + mauSo);
        }
    }

    public PhanSo copy() {
        return new PhanSo(tuSo, mauSo);
    }

    public void cong(int value) {
        tuSo += value * mauSo;
    }



}
