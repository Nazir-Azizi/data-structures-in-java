package com.data_structures.BinaryTree;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T> {
    
    @Override
    public void insert(T data) {
        root = insertImplementation(root ,data);
    }

    @Override
    public boolean search(T data) {
        return searchImplementation(root, data);
    }
    @Override
    public boolean delete(T data) {
        return false;   
    }

    private TreeNode insertImplementation(TreeNode root, T data){
        if (root == null){
            return new TreeNode(data);
        }
        if (root.data.compareTo(data) >= 0)
            root.left = insertImplementation(root.left, data);
        else
            root.right = insertImplementation(root.right, data);
        return root;
    }
    private boolean searchImplementation(TreeNode root, T data){
        if (root == null)
            return false;
        if (root.data == data)
            return true;
        if (root.data.compareTo(data) > 0)
            return searchImplementation(root.left, data);
        return searchImplementation(root.right, data);
    }
}
