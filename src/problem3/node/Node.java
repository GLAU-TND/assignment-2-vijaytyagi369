/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.node;


import problem5.student.Student;

public class Node {
    private Student data;
    private  Node next;

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

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(Student data, Node next) {
        this.data = data;
        this.next = next;
    }
    @Override
    public String toString() {
        return this.getData().toString();
    }
}
