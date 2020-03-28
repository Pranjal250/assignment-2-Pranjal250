/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String args[]) {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        obj.insert(10);
        obj.insert(2);
        obj.insert(5);
        obj.insert(10);
        obj.insert(11);
        obj.insert(5);
        obj.insert(69);
        obj.insert(58);
        System.out.print("Left Child nodes are: ");
        obj.printLeftNode(obj.root);
        System.out.println();
        System.out.println("No of nodes that dosn't have a left child node are: "+ obj.getCount());
    }
}
