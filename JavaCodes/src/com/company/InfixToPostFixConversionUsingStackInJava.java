package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

/*

Algorithm to Transform Infix Expression to PostFix Expression:

1. Scan the infix expression from left to right.
2. If the scanned character is an operand, output it.
3. Else,
…..3.1 If the precedence of the scanned operator is greater than the precedence of the operator in the stack(or the stack is empty), push it.
…..3.2 Else, Pop the operator from the stack until the precedence of the scanned operator is less-equal to the precedence of the operator residing on the top of the stack. Push the scanned operator to the stack.
4. If the scanned character is an ‘(‘, push it to the stack.
5. If the scanned character is an ‘)’, pop and output from the stack until an ‘(‘ is encountered.
6. Repeat steps 2-6 until infix expression is scanned.
7. Pop and output from the stack until it is not empty.

*/

class InfixToPostFix{
    private Stack theStack;
    private String input;
    private String output = "";
    public InfixToPostFix(String in){
        input = in;
        int stackSize = input.length();
        theStack = new Stack(stackSize);
    }
    public String doTrans(){
        for(int j=0; j<input.length(); j++){
            char ch = input.charAt(j);
            switch (ch){
                case '+' :
                case '-' :{
                    gotOper(ch, 1);
                    break;
                }
                case '*' :
                case '/' :{
                    gotOper(ch, 2);
                    break;
                }
                case '(' :{
                    theStack.push(ch);
                    break;
                }
                case ')':{
                    gotParen(ch);
                    break;
                }
                default:
                    output = output + ch;
                    break;
            }
        }
        while(!theStack.isEmpty()){
            output = output + theStack.pop();
        }
        System.out.println(output);
        return output;
    }
    public void gotOper(char opThis, int prec1){
        while(!theStack.isEmpty()){
            char opTop = theStack.pop();
            if(opTop == '('){
                theStack.push(opTop);
                break;
            }
            else{
                int prec2;
                if(opTop == '+' || opTop == '-'){
                    prec2 = 1;
                }
                else {
                    prec2 = 2;
                }
                if(prec2 < prec1){
                    theStack.push(opTop);
                    break;
                }
                else{
                    output = output + opTop;
                }
            }
        }
        theStack.push(opThis);
    }
    public void gotParen(char ch){
        while(!theStack.isEmpty()){
            char chx = theStack.pop();
            if(chx == '('){
                break;
            }
            else{
                output = output + chx;
            }
        }
    }
}
class Stack{
    private int maxSize;
    private char[] stackArray;
    private int top;

    public Stack(int max){
        maxSize = max;
        stackArray = new char[maxSize];
        top = -1;
    }
    public void push(char j){
        stackArray[++top] = j;
    }
    public char pop(){
        return stackArray[top--];
    }
    public char peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return (top == -1);
    }
}
public class InfixToPostFixConversionUsingStackInJava {
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner (System.in);
        String input = "1+2*4/5-7+3/6";
        String output;
        InfixToPostFix theTrans = new InfixToPostFix(input);
        output = theTrans.doTrans();
        System.out.println("PostFix is " + output + "\n");













    }
}
