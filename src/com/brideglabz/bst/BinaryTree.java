package com.brideglabz.bst;

public class BinaryTree<K extends Comparable<K>> {
    private BinaryNode<K> root;
    public void add(K key) {
            this.root = this.addRecursively(root, key);
        }
        private BinaryNode<K> addRecursively(BinaryNode<K> current, K key) {
            if (current == null)
                return new BinaryNode<K>(key);
            int compareResult = key.compareTo(current.key);
            if (compareResult == 0)
                return current;
            if (compareResult < 0)
                current.left = addRecursively(current.left, key);
            else
                current.right = addRecursively(current.right, key);
            return current;
        }

        public boolean searchNode(K key) {
            return searchNodeRecursively(root, key);
        }

        private boolean searchNodeRecursively(BinaryNode<K> current, K key) {
            if (current == null)
                return false;
            int compareResult = key.compareTo(current.key);
            if (compareResult == 0)
                return true;
            return compareResult < 0 ? searchNodeRecursively(current.left, key) : searchNodeRecursively(current.right, key);
        }

        public int getSize() {
            return this.getSizeRecursively(root);
        }

        private int getSizeRecursively(BinaryNode<K> current) {
            return current == null ? 0 : 1 + this.getSizeRecursively(current.left) + this.getSizeRecursively(current.right);
        }

        public void printTree() {
            System.out.println("Binary Tree : " + root);
        }

        @Override
        public String toString() {
            return "Binary Tree { " + root + " }";
        }
    }
