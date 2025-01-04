package com.data_structures.BinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;

public abstract class BinaryTree<T extends Comparable<T>> {
    class TreeNode{
        TreeNode left;
        TreeNode right;
        T data;
        TreeNode(T data){
            this.data = data;
        }
    }
    
    TreeNode root;

    public abstract void insert(T data);
    public abstract boolean search(T data);
    public abstract boolean delete(T data);

    public void preOrderTraversal(){
        preOrderTraversalImplementation(root);
    }
    public void inOrderTraversal(){
        inOrderTraversalImplementation(root);
    }
    public void postOrderTraversal(){
        postOrderTraversalImplementation(root);
    }
    public void levelOrderTraversal(){
        if (root == null)
            return;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode temp = queue.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null)
                queue.add(temp.left);
            if (temp.right != null)
                queue.add(temp.right);
        }
    }
    public int getHeightOfTree(){
        return getHeightOfTreeImplementation(root);
    }
    public int getNumberOfTreeNodes(){
        return getNumberOfTreeNodesImplementation(root);
    }


    // Implementation of methods
    private void preOrderTraversalImplementation(TreeNode rootTreeNode){
        if (rootTreeNode == null)
            return;
        System.out.println(rootTreeNode.data + " ");
        preOrderTraversalImplementation(rootTreeNode.left);
        preOrderTraversalImplementation(rootTreeNode.right);
    }

    private void inOrderTraversalImplementation(TreeNode rootTreeNode){
        inOrderTraversalImplementation(rootTreeNode.left);
        System.out.print(rootTreeNode.data + " ");
        inOrderTraversalImplementation(rootTreeNode.right);
    }
    
    private void postOrderTraversalImplementation(TreeNode rootTreeNode){
        postOrderTraversalImplementation(rootTreeNode.left);
        postOrderTraversalImplementation(rootTreeNode.right);
        System.out.print(rootTreeNode.data + " ");
    }

    private int getHeightOfTreeImplementation(TreeNode rootTreeNode){
        if (rootTreeNode == null){
            return 0;
        }
        return Math.max(getHeightOfTreeImplementation(rootTreeNode.left), 
        getHeightOfTreeImplementation(rootTreeNode. right))
         + 1;
    }

    private int getNumberOfTreeNodesImplementation(TreeNode rootTreeNode){
        if (rootTreeNode == null)
            return 0;
        return getNumberOfTreeNodesImplementation(rootTreeNode.left)
        + getNumberOfTreeNodesImplementation(rootTreeNode.right) 
        + 1;
    }
}
