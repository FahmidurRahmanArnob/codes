package aDataStructureUsingJava;
import java.util.*;
class QueueLinkedList{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node front = null;
    private Node end = null;
    public void enqueue(Scanner s){
        System.out.println("Enter Data: ");
        int data = s.nextInt();
        Node newNode = new Node(data);
        if(front == null){
            front = newNode;
            end = newNode;
        }
        else{
            end.next = newNode;
            end = newNode;
        }
    }
    public void dequeue(){
        if(front == null){
            System.out.println("UnderFlow Condition.");
        }
        else{
            front = front.next;
        }
    }
    public void printQueue(){
        Node temp = front;//creating a temporary pointer and it's pointing to front;
        while(temp != null){//jotokkhon na traverse korte korte temp pointer null pacche totokkhon ei loop cholbe r ki;
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
public class QueueInJavaUsingLinkedList {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int d;
        QueueLinkedList one = new QueueLinkedList();
        int l;
        do{
            System.out.println("PRESS 1 to ENQUEUE: ");
            System.out.println("PRESS 2 to DEQUEUE: ");
            System.out.println("PRESS 3 to PRINT_QUEUE: ");
            System.out.println("Enter your choice: ");
            d = s.nextInt();
            switch (d){
                case 1->{
                    one.enqueue(s);
                    break;
                }
                case 2->{
                    one.dequeue();
                    break;
                }
                case 3->{
                    one.printQueue();
                    break;
                }
            }
            System.out.println("ENTER 0 TO GO BACK TO MAIN MENU: ");
            System.out.println("OTHERWISE PRESS ANY NUMBER TO EXIT: ");
            l = s.nextInt();
        }while(l == 0);
        System.out.println("EXIT was SUCCESSFUL.");
    }
}
