package datastructuresandalgorithmes.c04LinkedLists;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedLIst list = new LinkedLIst();

        list.insertAtHead(5);
        list.insertAtHead(10);
        list.insertAtHead(45);
        list.insertAtHead(21);
        System.out.println("Initialized list " + list);
        System.out.println("Length " + list.length());
        list.deleteAtHead();
        System.out.println("After removing " + list);
        System.out.println("Length after removing " + list.length());

        System.out.println(String.format("'%d' is at '%d' index.", 10, list.search(10)));
        System.out.println(String.format("'%d' is at '%d' index.", 123, list.search(123)));

    }
}
