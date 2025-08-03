package toa_do;

import java.awt.*;

public class KhoangCach {
    public static void main(String[] args) {
        ToaDo point1= new ToaDo();
        ToaDo point2=new ToaDo();

        System.out.println("Nhap toa do thu nhat: ");
        point1.input();

        System.out.println("nhap toa do thu hai: ");
        point2.input();

        double distance=point1.khoangCach(point2);

        System.out.println("Khoang cach cua 2 diem la: "+distance);


    }
}
