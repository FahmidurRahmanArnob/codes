package aDataStructureUsingJava;
import java.util.Scanner;

class Stack{
    private Node top = null;

    static class Node{//This is a INNER class of the class Stack.
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
        //Node top = null;//initially the top the list is empty....
    }
    public void push(Scanner s){//Main Method er moddhe Scanner Class er jonno object banano hoisilo and s hocche ref. variable and passing this inside push will take the data that user gives...push function er through pass korlam r ki as a parameter...
        System.out.println("Enter data: ");
        int data = s.nextInt();
        Node newNode = new Node(data);//New Node banailam;
        if(top == null){
            top = newNode;
        }
        else{
            newNode.next = top;//NewNoder pointer part e top er address pass korlam
            top = newNode;//and top er moddhe newNode pass korlam ;
        }
    }
    public void pop(){
        if(top == null){
            System.out.println("Stack is EMPTY.");
        }
        else{
            top = top.next;
        }
    }
    public void printStack(){
        Node temp = top;
        while(temp != null){
            System.out.println(" " + temp.data);
            temp = temp.next;
        }
    }
}

public class StackUsingLinkedListInJava {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int d;
        Stack st = new Stack();
        int l;
        do{
            System.out.println("PRESS 1 to PUSH: ");
            System.out.println("PRESS 2 to POP: ");
            System.out.println("PRESS 3 to DISPLAY_THE_STACK: ");
            System.out.println("NOW ENTER YOUR CHOICE: ");
            d = s.nextInt();
            switch (d) {
                case 1 -> {
                    st.push(s);
                    break;
                }
                case 2 -> {
                    st.pop();
                    break;
                }
                case 3 -> {
                    st.printStack();
                    break;
                }
            }
            System.out.println("ENTER 0 TO GO BACK TO THE MAIN MENU: ");
            System.out.println("OR ENTER ANY NUMBER TO EXIT: ");
            l = s.nextInt();
        }while(l == 0);
        System.out.println("Exit SuccessFUL. ");
    }
}
