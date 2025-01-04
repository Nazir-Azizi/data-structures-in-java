package com.data_structures.BinaryTree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Before;

public class BinarySearchTreeTest {
    BinaryTree<Integer> tree;
    @Before
    public void setUp(){
        tree = new BinarySearchTree<>();
        tree.insert(6);
        tree.insert(4);
        tree.insert(3);
        tree.insert(5);
        tree.insert(8);
        tree.insert(9);
        tree.insert(7);
        tree.insert(2);
        tree.insert(1);
        tree.insert(10);
    }
    @Test
    public void insert_test(){
        tree.levelOrderTraversal();
    }
    @Test
    public void search_test(){
        assertTrue(tree.search(10));
    }

}
