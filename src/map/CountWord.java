package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
a. Đếm số lần xuất hiện của từ trong một văn bản
Viết một chương trình nhận vào một chuỗi văn bản và sử dụng Map để đếm số lần xuất hiện của từng từ trong văn bản.
 */
public class CountWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập văn bản");

        String text = sc.nextLine();

        String[] words= text.split(" ");
        Map<String,Integer> wordCount = new HashMap<>();

        for(String word : words){
            if(wordCount.containsKey(word)){
                int count = wordCount.get(word);
                wordCount.put(word,count+1);
            }else {
                wordCount.put(word,1);
            }
        }
        System.out.println("Số lần xuất hiện: ");
        for(String key : wordCount.keySet()){
            System.out.println(key + " : "+wordCount.get(key));
        }
    }
}
