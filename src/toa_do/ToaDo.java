package toa_do;

import java.awt.*;
import java.util.Scanner;

public class ToaDo {
    double x;
    double y;
    void input(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap x: ");
        x=sc.nextDouble();

        System.out.print("Nhap y: ");
        y=sc.nextDouble();
    }
    double khoangCach(ToaDo other){
        return Math.sqrt(Math.pow(other.x-x,2)+Math.pow(other.y-y,2));
    }
}
