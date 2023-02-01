package com.brideglabz.bst;

public class BinaryTreeMain {
    public static void main(String[] args) {
        System.out.println("...Binary Tree Data Structure...");

        BinaryTree<Integer> binaryTree = new BinaryTree<Integer>();
        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);

        System.out.println("\nBinary Tree Size = " + binaryTree.getSize() + "\n");
        binaryTree.printTree();
    }
}
//Ability to create a BST by
//adding 56 and then
//adding 30 & 70 - Use INode to create My Binary Node - Note the key has to extend comparable to
//compare and determine left or right node
//- First add 56 as root node so 30 will be
//added to left and 70 to right