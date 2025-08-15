package ke_thua;

import java.util.Scanner;

public class NewPhone extends Phone {
    private int quantity;

    public NewPhone(){
    }

    public NewPhone(String id, String name, double price, int warranty, String manufacturer, int quantity) {
        super(id, name, price, warranty, manufacturer);
        this.quantity = quantity;
    }

    public void input(){
        super.input();

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số lượng: ");
        this.quantity=sc.nextInt();
    }

    public void output(){
        super.output();

        System.out.println("Số lượng: "+this.quantity);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
