package datastructuresandalgorithmes.c07binarysearchtree;

import java.util.Objects;

public class TreeNode {

    private Integer data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(Integer data) {
        this.data = data;

    }

    public TreeNode find(Integer data) {
        if (data.equals(this.data)) {
            return this;
        } else if (data < this.data && leftChild != null) {
            return this.getLeftChild().find(data);
        } else if (rightChild != null) {
            return this.getRightChild().find(data);
        } else {
            return null;
        }
    }

    public Integer getData() {
        return data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public void insert(Integer data) {
        if (data >= this.data) {
            if (rightChild == null) {
                rightChild = new TreeNode(data);
            } else {
                rightChild.insert(data);
            }
        } else {
            if (leftChild == null) {
                leftChild = new TreeNode(data);
            } else {
                leftChild.insert(data);
            }
        }
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                '}';
    }
}
