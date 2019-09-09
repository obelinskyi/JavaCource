package datastructuresandalgorithmes.c04LinkedLists;

public class LinkedLIst {
    private Node head;

    void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }

    void deleteAtHead() {
        this.head = this.head.getNextNode();
    }

    @Override
    public String toString() {
        return "LinkedLIst{" +
                "head=" + head +
                '}';
    }

    int length() {
        int length = 0;
        Node currentNode = this.head;
        while (currentNode != null) {
            length++;
            currentNode = currentNode.getNextNode();
        }
        return length;
    }

    int search(int data) {
        int index = 0;
        Node currentNode = this.head;
        while (currentNode != null) {
            if (data == currentNode.getData()) {
                return index;
            }
            index++;
            currentNode = currentNode.getNextNode();
        }
        return -1;
    }
}
