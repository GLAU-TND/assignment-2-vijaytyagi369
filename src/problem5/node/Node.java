/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.node;

import problem5.student.Student;

// to define node properties
public class Node {
    private Student data;
    private problem3.node.Node next;

    public Node(Student data) {
        this.data = data;
        this.next= null;
    }

    public Student getData() {
        return data;
    }

    public void setData(Student data) {
        this.data = data;
    }

    public problem3.node.Node getNext() {
        return next;
    }

    public void setNext(problem3.node.Node next) {
        this.next = next;
    }

    public Node(Student data, problem3.node.Node next) {
        this.data = data;
        this.next = next;
    }
    @Override
    public String toString() {
        return this.getData().toString();
    }
}
