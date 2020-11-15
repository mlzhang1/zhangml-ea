package com.example.zhangmlea;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
}

public class test {
    public static void main(String[] args) {
        test t = new test();
        t.threeOrders();
    }

    public int[][] threeOrders (TreeNode root) {
        // write code here
        int[][] a = new int[3][];

        List<Integer> preOrderList = new ArrayList<>();
        List<Integer> inOrderList = new ArrayList<>();
        List<Integer> postOrderList = new ArrayList<>();

        preOrder(root, preOrderList);
        inOrder(root, inOrderList);
        postOrder(root, postOrderList);

        a[0] = preOrderList.stream().mapToInt(e -> e).toArray();
        a[1] = inOrderList.stream().mapToInt(e -> e).toArray();
        a[2] = postOrderList.stream().mapToInt(e -> e).toArray();

        return a;
    }

    private void preOrder(TreeNode root, List<Integer> list) {
        list.add(root.val);
        if (root.left != null) {
            preOrder(root.left, list);
        }
        if (root.right != null) {
            preOrder(root.right, list);
        }
    }

    private void inOrder(TreeNode root, List<Integer> list) {
        if (root.left != null) {
            inOrder(root.left, list);
        }
        list.add(root.val);
        if (root.right != null) {
            inOrder(root.right, list);
        }
    }

    private void postOrder(TreeNode root, List<Integer> list) {
        if (root.left != null) {
            postOrder(root.left, list);
        }
        if (root.right != null) {
            postOrder(root.right, list);
        }
        list.add(root.val);
    }
}
