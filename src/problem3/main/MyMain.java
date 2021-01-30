/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem5.student.Student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {

    public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue();
        Student st1 = new Student(2,"abc","def",2);
        Student st2 = new Student(3,"abc","def",3);
        Student st3 = new Student(1,"abc","def",4);
        Student st4 = new Student(4,"abc","def",5);
        queue.offer(st1);
        queue.offer(st3);
        queue.offer(st2);
        queue.offer(st4);
        queue.offer(st2);
        queue.offer(st4);
        queue.offer(st1);
        queue.offer(st3);

        System.out.println(queue);
        System.out.println();
        queue.remove();
        System.out.println();
        System.out.println(queue);
        System.out.println();
        queue.offer(st1);
        queue.offer(st4);
        queue.offer(st3);

        System.out.println(queue);

    }
}
