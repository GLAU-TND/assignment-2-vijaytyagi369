/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;

public class MyMain {
    public static void main(String[] args) {
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

        myTree.leftView(rootNode);
    }
}
