package codewars.treenode;

public class Solution {
    
    static TreeNode arrayToTree(int[] array) {
        return arrayToTree(array, 0);
    }

    static TreeNode arrayToTree(int[] array, int index) {
        return index < array.length ?
                new TreeNode(array[index], arrayToTree(array, index * 2 + 1), arrayToTree(array, index * 2 + 1)) :
                null;
    }

    private static int[] arrayFrom(int... values) {
        return values;
    }

    public static void main(String[] args) {
        arrayToTree(arrayFrom(17, 0, -4, 3, 15));
    }
}