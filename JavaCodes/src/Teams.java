import java.util.*;
public class Teams {
    public static void main(String[] args){
        Scanner fs = new Scanner(System.in);
        int T = fs.nextInt();
        int[] arr = new int[3];
        int[] brr = new int[1001]; //this keeps track of the 'Two member being agreed on the problem's soluiton' part;
        int count = 0, countTwo = 0;
        for(int i=1; i<=T; i++){
            //This loops checks the T that is given means how many vertical columns should be there;
            for(int j=0; j<=2; j++){
                //this loops takes the input of the array;
                arr[j] = fs.nextInt();
                count = arr[0] + arr[1] + arr[2];
            }
            brr[i] = count;
            if(brr[i] >= 2)countTwo++;
        }
        System.out.println(countTwo);
    }
}


//import java.util.Scanner;
//public class Teams
//{
//    public static void main(String args[])
//    {
//        Scanner ip = new Scanner(System.in);
//        int x=ip.nextInt();
//        int ctr=0,s=0;
//        int[] a = new int[3];
//        int[] b = new int[1001];
//        for(int i=1;i<=x;i++)
//        {
//            for(int j=0;j<=2;j++)
//            {
//                a[j]=ip.nextInt();
//                s=a[0]+a[1]+a[2];
//            }
//            b[i]=s;
//            if(b[i]>=2)
//                ctr++;
//        }
//        System.out.println(ctr);
//    }
//}
