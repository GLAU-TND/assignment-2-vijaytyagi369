/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

import java.util.Scanner;

//executable class
public class MyMain {
    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Students in the list ? ");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter roll no");
            int roll = sc.nextInt();
            System.out.println("Enter FirstName");
            String firstName = sc.next();
            System.out.println("Enter LastName");
            String lastName = sc.next();
            System.out.println("Enter BackLogs");
            int back = sc.nextInt();
            myCircularQueue.enqueue(new Student(roll,firstName,lastName,back));
        }
        System.out.println(" Students before removing:- " + MyCircularQueue.getSize());
        System.out.println("No of students deleted:- " + myCircularQueue.remove());
        System.out.println("New Size of Student List:- " + (MyCircularQueue.getSize() - myCircularQueue.remove()));
    }
}
