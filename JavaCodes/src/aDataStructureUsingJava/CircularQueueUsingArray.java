package aDataStructureUsingJava;
import java.util.*;
import java.lang.*;
import java.io.*;

class QueueOne{
    int front = -1, rear = -1;
    int n = 10; // this is the array size;
    int[] arr = new int[n];

    public void enqueue(Scanner s){
        if(front == ((rear + 1) % n)){
            System.out.println("OverFlow Condition.");
        }
        else{
            System.out.println("Enter Data: ");
            int data = s.nextInt();
            if(front == -1 && rear == -1){
                front = 0;
                rear = 0;
                arr[rear] = data;
            }
            else{
                rear = (rear + 1) % n;
                arr[rear] = data;
            }
        }
    }
    public void dequeue(){
        if(front == -1 && rear == -1){
            System.out.println("OverFlow Condition.");
        }
        else if(front == rear){
            System.out.println("UnderFlow Condition.");
            front = -1;
            rear = -1;
        }
        else{
            front = (front + 1) % n;
        }
    }
    public void Print_QUEUE(){
        int i;
        for(i=front; i!=rear; i=(i+1) % n){
            System.out.println(arr[i]);
        }
        System.out.println(arr[i]);
    }
}

public class CircularQueueUsingArray {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int d;
        QueueOne one = new QueueOne();
        int l;
        do{
            System.out.println("PRESS 1 to ENQUEUE: ");
            System.out.println("PRESS 2 to DEQUEUE: ");
            System.out.println("PRESS 3 to Print_QUEUE: ");
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
                    one.Print_QUEUE();
                    break;
                }
            }
            System.out.println("ENTER 0 TO GO BACK TO THE MAIN MENU: ");
            System.out.println("OTHERWISE ENTER ANY NUMBER TO EXIT: ");
            l = s.nextInt();
        }while(l == 0);
        System.out.println("Exit was SUCCESSFUL. ");
    }
}
