package generic.my_linkedlist.my_linkedlist;

public class MainLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Object> myLinkedList= new MyLinkedList();

        myLinkedList.addFirst(10);
        myLinkedList.addFirst(20);
        myLinkedList.addFirst(30);
        System.out.println("Sau addFirst 30, 20, 10:");
        System.out.println(myLinkedList);

        // Test addLast
        myLinkedList.addLast(40);
        myLinkedList.addLast(50);
        System.out.println("Sau addLast 40, 50:");
        System.out.println(myLinkedList);

        // Test add(index, element)
        myLinkedList.add(2, 99);
        System.out.println("Sau add(2, 99):");
        System.out.println(myLinkedList);

        // Test removeFirst
        int removedFirst = (int) myLinkedList.removeFirst();
        System.out.println("removeFirst -> " + removedFirst);
        System.out.println(myLinkedList);

        // Test removeLast
        int removedLast = myLinkedList.removeLast();
        System.out.println("removeLast -> " + removedLast);
        System.out.println(myLinkedList);

        // Test remove(index)
        int removedAt = (int) myLinkedList.remove(2);
        System.out.println("remove(2) -> " + removedAt);
        System.out.println(myLinkedList);

        // Test getFirst & getLast
        System.out.println("getFirst: " + myLinkedList.getFirst());
        System.out.println("getLast: " + myLinkedList.getLast());

        // Test get(index)
        System.out.println("get(1): " + myLinkedList.get(1));

        // Test set(index, element)
        myLinkedList.set(1, 777);
        System.out.println("Sau set(1, 777):");
        System.out.println(myLinkedList);

        // Test indexOf & lastIndexOf
        myLinkedList.addLast(777);
        myLinkedList.addLast(20);
        System.out.println("Danh sách hiện tại:");
        System.out.println(myLinkedList);

        System.out.println("indexOf(777): " + myLinkedList.indexOf(777));
        System.out.println("lastIndexOf(777): " + myLinkedList.lastIndexOf(777));
        System.out.println("indexOf(20): " + myLinkedList.indexOf(20));
        System.out.println("lastIndexOf(20): " + myLinkedList.lastIndexOf(20));
    }
}
