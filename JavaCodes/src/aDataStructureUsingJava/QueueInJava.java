package aDataStructureUsingJava;
import java.util.*;
import java.lang.*;

class Queue{
    int front = -1, rear = -1, n = 10;
    int[] array = new int[n];

    void enqueue(Scanner sc){
        if(rear == (n - 1)){//Here n is the size of the queue;
            System.out.println("OVER_FLOW CONDITION.");
        }
        else{
            System.out.println("ENTER THE DATA FOR THE QUEUE: ");
            int data = sc.nextInt();
            if(front == -1 && rear == -1){
                front = 0;
                rear = 0;
                array[rear] = data;
            }
            else{
                rear += 1;
            }
            array[rear] = data;
        }
    }
    void dequeue(){
        if(front == -1 && rear == -1){
            System.out.println("UNDER_FLOW CONDITION. ");
        }
        else {
            front += 1;
        }
    }
    void printQueue(){
        System.out.println("ITEMS ARE: ");
        for(int i=front; i<=rear; i++){
            System.out.println(" " + array[i]);
        }
    }
}

public class QueueInJava {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Queue s = new Queue();
        int d, l;
        do{
            System.out.println("PRESS 1 to ENQUEUE the QUEUE: ");
            System.out.println("PRESS 2 to DEQUEUE the QUEUE: ");
            System.out.println("PRESS 3 to PRINT the QUEUE: ");
            System.out.println("NOW ENTER YOUR CHOICE: ");
            d = sc.nextInt();
            switch (d) {
                case 1 ->{
                    s.enqueue(sc);
                    break;
                }
                case 2 ->{
                    s.dequeue();
                    break;
                }
                case 3 ->{
                    s.printQueue();
                    break;
                }
            }
            System.out.println("ENTER 0 TO GO BACK TO THE MAIN MENU: ");
            System.out.println("ENTER ANY NUMBER TO EXIT: ");
            l = sc.nextInt();
        }while(l == 0);
        System.out.println("EXIT was successful. ");
    }
}
