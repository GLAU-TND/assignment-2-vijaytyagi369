/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    static Queue<TreeNode> myQueue;

    public TreeNode insert(TreeNode root, int x) {

        if (root == null)

            return new TreeNode(x);

        else if (x > root.getData())

            root.setRight(insert(root.getRight(), x));

        else
            root.setLeft(insert(root.getLeft(), x));

        return root;

    }

    public void inorderRec(TreeNode root) {

        if (root.getLeft() != null) {

            inorderRec(root.getLeft());

            System.out.println(root.getData());

            inorderRec(root.getRight());

        }

    }

    public void countNodeWithOutLeftChild(TreeNode root) {

        if (root == null)

            return;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.add(root);


        int count = 0;

        while (queue != null) {

            TreeNode temp = queue.poll();

            if (temp == null) {

                break;

            }


            if (temp.getLeft() == null)

                count++;


            if (temp.getLeft() != null)

                queue.add(temp.getLeft());


            if (temp.getRight() != null)

                queue.add(temp.getRight());

        }

        System.out.println("Number of nodes without left child: " + count);

    }

    public void printLeftTree(TreeNode root) {
        if (root == null) {
            return;
        }
        myQueue.add(root);
        myQueue.add(null);
        while (myQueue.size() > 0) {
            TreeNode temp = myQueue.peek();
            if (temp != null) {
                System.out.print(temp.getData() + " ");
                while (myQueue.peek() != null) {

                    if (temp.getLeft() != null)
                        myQueue.add(temp.getLeft());

                    if (temp.getRight() != null) {
                        myQueue.add(temp.getRight());
                    }
                    myQueue.remove();
                    temp = myQueue.peek();
                }
                myQueue.add(null);
            }
            myQueue.remove();

        }

    }
    public void leftView(TreeNode root) {
        myQueue = new LinkedList<TreeNode>();
        printLeftTree(root);

    }

}
