package datastructuresandalgorithmes.c07binarysearchtree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bn = new BinarySearchTree();
        bn.insert(17);
        bn.insert(12);
        bn.insert(99);
        bn.insert(12);
        bn.insert(65);
        bn.insert(19);
        bn.insert(75);
        bn.insert(1);
        bn.insert(14);
        bn.insert(102);
        bn.insert(500);
        System.out.println("Tree is: " + bn);
        System.out.println(bn.find(14));
    }
}
