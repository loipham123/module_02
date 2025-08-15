package ke_thua;

import java.util.Scanner;

public class OldPhone extends Phone {
    private int batteryPercentage;
    private String description;

    public OldPhone(){
    }

    public OldPhone(String id, String name, double price, int warranty, String manufacturer, int batteryPercentage, String description) {
        super(id, name, price, warranty, manufacturer);
        this.batteryPercentage = batteryPercentage;
        this.description = description;
    }
    @Override
    public void input(){
        super.input();

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào tình trạng pin (%): ");
        this.batteryPercentage=Integer.parseInt(sc.nextLine());

        System.out.print("Nhập vào mô tả thêm: ");
        this.description=sc.nextLine();
    }

    public void output(){
        super.output();
        System.out.println("Tình trạng pin (%): "+this.batteryPercentage);
        System.out.println("Mô tả thêm: "+this.description);
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public void setBatteryPercentage(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
