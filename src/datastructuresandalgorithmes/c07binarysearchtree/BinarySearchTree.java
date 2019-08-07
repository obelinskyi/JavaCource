package datastructuresandalgorithmes.c07binarysearchtree;

import java.util.TreeMap;

public class BinarySearchTree {
    private TreeNode root;

    public void insert(Integer data) {
        if(root == null) {
            this.root = new TreeNode(data);
        } else root.insert(data);
    }

    public TreeNode find(Integer data) {
        if (root != null) {
            return this.root.find(data);
        } else {
            return null;
        }
    }

    public void delete(Integer data) {
        new TreeMap<>();
    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }
}
