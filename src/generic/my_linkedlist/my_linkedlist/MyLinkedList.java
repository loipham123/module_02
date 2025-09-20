package generic.my_linkedlist.my_linkedlist;

public class MyLinkedList<E> {
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

    public void addFirst(E element) {
        Node newNode = new Node(element);
        if (head == null) {//trường hợp danh sách rỗng
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
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
    } // c. addLast(int element)

    public void addLast(E value) {
        Node newNode = new Node(value);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // d. add (int index, int element)
    public void add(int index, E element) {
        if (index < 0 || index > size) ;
        if (index == 0) {
            addFirst(element);
        } else if (index == size) {
            addLast(element);
        } else {
            Node newNode = new Node(element);
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            newNode.next = prev.next;
            prev.next = newNode;
            size++;
        }
    }

    //e. removeFirst ()
    public E removeFirst() {
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

    //f. removeLast ()
    public Integer removeLast() {
        if (tail == null) {
            return null;
        }
        if (head == tail) {
            Object value = head.value;
            head = tail = null;
            size--;
            return (Integer) value;
        }
        Node prev = head;
        while (prev.next != tail) {
            prev = prev.next;
        }
        Object value = tail.value;
        tail = prev;
        tail.next = null;
        size--;
        return (Integer) value;
    }

    //g. remove (int index)
    public E remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index ko hợp lệ");
            return null;
        }
        if (index == 0) {
            return removeFirst();
        }
        if (index == size - 1) {
            return (E) removeLast();
        }

        Node prev = head;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        Object value = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return (E) value;
    }

    //h. getFirst ()
    public E getFirst() {
        if (head == null) {
            return null;
        }
        return (E) head.value;
    }

    //i. getLast ()
    public E getLast() {
        if (tail == null) {
            return null;
        }
        return (E) tail.value;
    }

    //j. get (int index)
    public E get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index ko hợp lệ");
            return null;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return (E) current.value;
    }

    //k. set (int index, int element)
    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            System.out.println("Index ko hợp lệ");
            return;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.value = value;
    }

    //l. indexOf (int element)
    public int indexOf(E element) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.value == element) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    //m. lastIndexOf (int element)
    public int lastIndexOf(E element) {
        Node current = head;
        int index = 0;
        int lastIndex = -1;
        while (current != null) {
            if (current.value == element) {
                lastIndex = index;
            }
            current = current.next;
            index++;
        }
        return lastIndex;
    }
}
