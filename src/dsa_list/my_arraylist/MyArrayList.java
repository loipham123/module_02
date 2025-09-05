package dsa_list.my_arraylist;

public class MyArrayList {
    private int capacity;//kich thuoc thuc te

    private int size;//so phan tu add vao

    private int[] elementData;

    private final int[] emptyArray = {}; //tai su dung nhieu lan

    public MyArrayList() {
        elementData = emptyArray;
    }

    public int size() {
        return size;
    }

    public void add(int element) {
        //truong hop 1: size == capacity
        if (elementData == emptyArray) { //Thông qua default
            capacity = 10;
            elementData = new int[capacity];
        }
        //Kiểm tra xem size == capacity
        if (size == capacity) {
            if (capacity == 0) {//Tránh trường hợp capacity = 0
                capacity = 1;
            } else if (capacity == 1) {//Tránh trường hợp capacity = 1
                capacity = 2;
            } else {
                //tao mang moi gap 50%
                capacity *= 1.5;
            }

            int[] temp = new int[capacity];

            //đổ dữ liệu qa mảng mới
            for (int i = 0; i < elementData.length; i++) {
                temp[i] = elementData[i];
            }
            //tham chieu vung nho moi
            elementData = temp;
        }
        //th2:size < capacity -> add phần tử vào
        elementData[size] = element;
        size++;
    }

    //b.Trả về thông tin đối tượng
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(elementData[i]).append("\t");
        }
        return stringBuilder.toString();
    }

    //c.Thêm phần tử vào vị trí index
    public void add(int index, int element) {
        if (index < 0 || index > size) {
            System.out.println("Index ngoài phạm vi");
            return;
        }

        if (size == capacity) {//tăng
            this.capacity *= 1.5;
            if (size == capacity) {
                capacity++;
            }
            int[] brr = new int[this.capacity];

            for (int i = 0; i < size; i++) {
                brr[i] = elementData[i];
            }

            brr[index] = element;

            for (int i = index; i < size; i++) {
                brr[i + 1] = elementData[i];
            }

            elementData = brr;
        } else {
            for (int i = size; i > index; i--) {
                elementData[i] = elementData[i - 1];
            }
            elementData[index] = element;
        }
        size++;
    }

    //d.Thay thế phần tử tại ví trí index
    public void set(int index, int element) {
        if (index < 0 || index > size) {
            System.out.println("Index ngoài phạm vi");
            return;
        }
        //gán giá trị mới vào index
        elementData[index] = element;
    }

    //e.Trả về phần tử index
    public Integer get(int index) {
        if (index < 0 || index > size) {
            System.out.println("Index ngoài phạm vi");
            return null;
        }
        return elementData[index];
    }

    //f.Lấy vị trí index đầu phần tử đầu tiên tìm thấy
    public int indexOf(int element) {
        for (int i = 0; i < size; i++) {
            if (elementData[i] == element) {
                return i;
            }
        }
        return -1;
    }

    //g.Lấy vị trí index phần tử cuối cùng tìm thấy
    public int lastIndexOf(int element) {
        for (int i = size - 1; i > 0; i--) {
            if (elementData[i] == element) {
                return i;
            }
        }
        return -1;
    }

    //h.Xóa phần tử ví trí index
    public void remove(int index) {
        if (index < 0 || index > size) {
            System.out.println("Index ngoài phạm vi");
            return;
        }
        for (int i = index; i < size; i++) {
            elementData[i] = elementData[i + 1];
        }
        size--;
    }

    //i.Xóa tất cả phần tử element
    public void removeElement(int element) {
        int newIndex = 0;
        //sao chép phần tử khác element vào mảng mới
        for (int i = 0; i < size; i++) {
            if (elementData[i] != element) {
                elementData[newIndex] = elementData[i];
                newIndex++;
            }
        }
        size = newIndex;
    }
}
