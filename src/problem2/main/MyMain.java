/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
import problem2.main.Traverse.TraverseTree;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        TraverseTree traversing = new TraverseTree();
        MyBinarySearchTree myTree = new MyBinarySearchTree();

        TreeNode rootNode;

        rootNode = new TreeNode(61);

        myTree.insert(rootNode, 9);
        myTree.insert(rootNode, 1);
        myTree.insert(rootNode, 4);
        myTree.insert(rootNode, 9);
        myTree.insert(rootNode, 43);
        myTree.insert(rootNode, 91);
        myTree.insert(rootNode, 46);
        myTree.insert(rootNode, 76);
        myTree.insert(rootNode, 81);
        myTree.insert(rootNode, 39);
        myTree.insert(rootNode, 54);
        myTree.insert(rootNode,12);
        traversing.getPrefixOrder(rootNode);
        System.out.println();
        traversing.getPostOrder(rootNode);
    }
}
