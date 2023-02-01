package com.brideglabz.bst;

public class BinaryTreeMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Binary Tree Data Structure!");

        BinaryTree<Integer> binaryTree = new BinaryTree<Integer>();
        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);
        binaryTree.add(22);
        binaryTree.add(40);
        binaryTree.add(60);
        binaryTree.add(95);
        binaryTree.add(11);
        binaryTree.add(65);
        binaryTree.add(3);
        binaryTree.add(16);
        binaryTree.add(63);
        binaryTree.add(67);

        System.out.println("\nBinary Tree Size = " + binaryTree.getSize() + "\n");
        binaryTree.printTree();
    }
}
//Ability to create the
//binary tree shown in the
//figure
//- Check if all are added with using size
//method in Binary Tree