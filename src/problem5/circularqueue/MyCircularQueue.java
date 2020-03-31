/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem3.node.Node;
import problem5.student.Student;

//to implement circular queue
public class MyCircularQueue {
    private static Node rear;
    private static int size;

    public MyCircularQueue() {
        rear = null;
        size = 0;
    }
    public void enqueue(Student data) {
        Node node = new Node(data);
        if (isEmpty()) {
            rear = node;
            size++;
            node.setNext(node);
        } else {
            node.setNext(rear.getNext());
            rear.setNext(node);
            rear = node;
            size++;
        }

    }
    public static boolean dequeue() {
        boolean response = false;
        if (!isEmpty()) {
            size--;
            response = true;
            if (rear.getNext() == rear) {
                rear = null;
            } else {
                rear.setNext(rear.getNext().getNext());
            }
        }
        return response;
    }

    public static Node getRear() {
        return rear;
    }

    public static void setRear(Node rear) {
        MyCircularQueue.rear = rear;
    }

    public static int getSize() {
        return size;
    }

    public static void setSize(int size) {
        MyCircularQueue.size = size;
    }
    public Node peek() {
        Node response = null;
        if (!isEmpty()) {
            response = rear.getNext();
        }
        return response;
    }

    private static boolean isEmpty() {
        boolean response = false;
        if (rear == null)
            response = true;
        return response;
    }
    public int remove() {
        int k = 0;
        int l = 0;
        Node head = rear.getNext();
        while (l < size) {
            if (head.getData().getBackLog() == 0) {
                ++k;
                System.out.println(head.getData().getFirstName()+" "+head.getData().getLastName());
                head = head.getNext();
                ++l;
            } else {
                head = head.getNext();
                ++l;
            }
        }
        return k;
    }
}
