package com.company;
import java.util.*;

public class ProgramToReverseaNumber {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number That You Want to Reverse: ");
        int NumberToReverse = s.nextInt();
        System.out.println(reverseNumber(NumberToReverse));
    }
    static String reverseNumber(int num){
        int rNum = 0;
        while(num>0){//Ei Function er arguments jodi 0 er theke boro hoy taile loop cholbe;
            int remainderVariable = num % 10;
            rNum = (rNum * 10) + remainderVariable;
            num = num / 10;
        }
        return "Reversed Number of entered Number is: " + Integer.toString(rNum);
    }
}
