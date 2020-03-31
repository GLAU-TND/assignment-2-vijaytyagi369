/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

import problem1.node.TreeNode;

public class MyQueue {
    private Node front;
    private Node rear;

    public MyQueue() {
        front = null;
        rear = null;
    }

    public void enqueue(int data) {
        Node newNode= new Node(data);
        if (front == null) {
            front = rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
    }
    public void storePreSuccessor(TreeNode root) {
        if (root == null)
            return;
        else {
            enqueue(root.getData());
            storePreSuccessor(root.getLeft());
            storePreSuccessor(root.getRight());
        }
    }
    public void printQueue() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.getData() + "\t");
            temp = temp.getNext();
        }
    }

    private static class Node {
        private Node next;
        private int data;


        public Node( int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return String.valueOf(this.getData());
        }
    }
}
