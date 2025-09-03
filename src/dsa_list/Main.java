package dsa_list;

public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();

        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        myArrayList.add(40);
        myArrayList.add(50);
        myArrayList.add(60);
        myArrayList.add(70);
        myArrayList.add(80);
        myArrayList.add(90);
        myArrayList.add(100);
        myArrayList.add(110);

        System.out.println("b.Danh sách ban đầu: " + myArrayList.toString());

        myArrayList.add(2, 25);
        System.out.println("c.Danh sách sau khi add 25 vào vị trí 2: " + myArrayList.toString());

        myArrayList.set(3, 35);
        System.out.println("d.Danh sách sau khi thay thế vị trí 3 bằng 35: " + myArrayList.toString());

        int elementIndex = myArrayList.get(4);
        System.out.println("e.Phần tử tại ví trí 4 là: " + elementIndex);

        //f
        int elementToFind = 35;
        int indexOfElement = myArrayList.indexOf(elementToFind);
        if (indexOfElement != -1) {
            System.out.println("f.Ví trí index của phân tử " + elementToFind + " là " + indexOfElement);
        } else {
            System.out.println("f.Không tìm thấy phần tử " + elementToFind + " trong danh sách");
        }

        //g.
        int lastIndexOfElement = myArrayList.lastIndexOf(elementToFind);
        if (lastIndexOfElement != -1) {
            System.out.println("g.Ví trí index cuối cùng của phẩn tử " + elementToFind + " là " + lastIndexOfElement);
        } else {
            System.out.println("g.Không tìm thấy phần tử " + elementToFind + " trong danh sách");
        }

        //h
        myArrayList.remove(1);
        System.out.println("h.Danh sách sau khi xóa phần tử vị trí 1: " + myArrayList.toString());

        //i
        myArrayList.removeElement(30);
        System.out.println("i.Danh sách sau khi xóa tất cả các phần tử có giá trị 30 là: " + myArrayList.toString());
    }
}
