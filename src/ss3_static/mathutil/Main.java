package ss3_static.mathutil;

public class Main {
    public static void main(String[] args) {
        double num1=9.0;
        double num2=6.0;

        double sum=MathUtil.add(num1,num2);
        double difference=MathUtil.subtract(num1,num2);
        double product =MathUtil.multiply(num1,num2);
        double quotient=MathUtil.divide(num1,num2);

        System.out.println("Tổng: "+sum);
        System.out.println("Hiệu: "+difference);
        System.out.println("Tích: "+product);
        System.out.println("Thương: "+quotient);

    }
}
