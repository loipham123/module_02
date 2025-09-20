package stack;

import dsa_list.my_linkedlist.MyLinkedList;

public class    MyStack<E> {
    private class Node {
        Object value;
        Node next;

        public Node(E value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    public int size;

    public void push(E element) {
        Node newNode = new Node(element);
        if (head == null) {//trường hợp danh sách rỗng
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public E pop() {
        if (head == null) {
            return null;
        }

        Object value = head.value;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--; // giảm kích thước
        return (E) value; // trả về giá trị đã xóa
    }

    public E peek() {
        if (head == null) {
            return null;
        }
        return (E) head.value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        Node temp = head;
        for (int i = 0; i < size; i++) {
            stringBuilder.append(temp.value).append("\t");
            temp = temp.next;
        }
        return stringBuilder.toString();
    }
}

