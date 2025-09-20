package exception;

public class Main {
    static final String hello ="HELLO";
    public static void main(String[] args) {
//        int a = 1/ 0; //ArithmeticException => chia cho 0

//        int[] arr={1,2,3};
//        System.out.println(arr[3]); //ArrayIndexOutOfBoundsException =>Ngoài phạm vi index

//        String str = null;
//        str.equals("hello"); //NullPointerException => null nhưng cố gắng chấm tới

        //Cách để không xảy ra trường hợp NullPointerException
//        String str = null;
//        //cách 1:
//        if(str != null) { if (str.equals(hello)) {} }
//        //c2:
//        if(hello.equals(str)){} // không bao giờ bị NullPointerException

        //Xử lí Exception
        //try-catch:
        try{
//            int a=1/0;
            String str=null;
            str.equals(hello);
        }catch (ArithmeticException e){
            System.out.println("Rơi vào khối catch ArithmeticException");
        }catch (NullPointerException e){
            System.out.println("Rơi vào khối catch NullPointerException");
        } catch (Exception e) {
            System.out.println("Exception");
        }finally { //Luôn luôn chạy
            System.out.println("Kết thúc!!");
        }
        System.out.println("Kết thúc");
        System.out.println("Chương trình kết thúc không lỗi lầm!!!");

    }
}
