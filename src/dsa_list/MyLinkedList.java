package dsa_list;

public class MyLinkedList {
    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int element){
        Node newNode = new Node(element);
        if(head == null){//trường hợp danh sách rỗng
            head = tail = newNode;
        }else {
            newNode.next=head;
            head= newNode;
        }
        size++;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node temp= head;
        for(int i=0;i<size;i++){
            stringBuilder.append(temp.value).append("\t");
            temp=temp.next;
        }
        return stringBuilder.toString();
    }
}
