/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;
import problem3.node.Node;
import problem5.student.Student;

import java.util.NoSuchElementException;

public class MyPriorityQueue {
    private Node front=null;
    private Node rear=null;
    private  int size=0;

    public boolean offer(Student student)
    {
        int index = getRightIndex(student);
        if(index ==0)
        {
            if(front==null) {
                front = new Node(student);
                rear = front;
                size++;
            }
            else
            {
                Node newNextNode = front;
                front = new Node(student,newNextNode);
                size++;
            }

        }
        else if(index >0 && index<size)
        {
         Node newNextNode = getNode(index);
         getNode(index-1).setNext(new Node (student,newNextNode));
         size++;
        }
        else if(index==size)
    {
        Node newPreviousNode = getNode(index-1);
        Node newNode =new Node(student);
        newPreviousNode.setNext(new Node(student));
        rear= newNode;
        size++;
    }
        return true;
    }

    public Student poll() {
        if (front == null) {
            return null;
        } else {
            Student temp = front.getData();
            front = front.getNext();
            size--;
            return temp;
        }
    }
    public  Student peek() {
        if (front == null)
            return null;
        else {
            return front.getData();
        }
    }
    public  Student remove() {
        if (front == null) {
            throw new NoSuchElementException("Queue is Empty");
        } else {
             Student item = peek();
            front = front.getNext();
            size--;
            return item;
        }
    }
    public  Student element() {
        if (front == null)
            throw new NoSuchElementException("Queue Is Empty");
        else {
            return front.getData();
        }
    }
    private Node getNode(int index)
    {
        Node response = this.front;
        for (int i = 0; i < index; i++) {
            response= response.getNext();
        }
        return response;
    }
    private int getRightIndex(Student student)
    {
        if(this.size==0)
        {
             return 0;
        }
        else {
            for (int i = 0; i < this.size; i++) {
                Student item = getNode(i).getData();
                int compare = item.compareTo(student);
                if (compare >= 0)
                {
                    return i;
                }

            }
        }
        return size;

    }
    @Override
    public String toString() {
        {
            StringBuilder sb = new StringBuilder();
            Node temp = front;
            for (int i = 0; i < size; i++) {
                if ((i < size - 1)) {
                    sb.append(temp.toString());
                    sb.append("\n");
                    temp = temp.getNext();
                } else {
                    sb.append(temp.toString());
                }
            }
            return sb.toString();
        }
    }
}
