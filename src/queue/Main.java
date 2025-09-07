package queue;

public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        while (!queue.isEmpty()){
            System.out.println(queue.remove());
        }
        System.out.println(queue.size());
    }
}
