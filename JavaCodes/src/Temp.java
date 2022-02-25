import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.regex.*;
import static java.lang.System.*;

public class Temp {
    public static void main(String[] args){
        FastScaner fs = new FastScaner();
        int T = fs.nextInt();
        for(int tt=0;tt<T;tt++){
            //Your Code Goes Here;
        }
    }
    static int addIterative(int a, int b){//this method adds two number without using the plus operator;

        while(b != 0){
            int carry = (a & b); // Carry is AND of two bits;
            a = a ^ b; // Sum of two bits is a XOR b;
            b = carry << 1; // shifts carry to 1 bit to calculate sum;
        }
        return a;
    }
    static final Random random = new Random();
    //Taken From "Second Thread"
    static void ruffleSort(int[] a){
        int n = a.length;//shuffles, then sort;
        for(int i=0; i<n; i++){
            int oi = random.nextInt(n), temp = a[oi];
            a[oi] = a[i]; a[i] = temp;
        }
    }
    static class FastScaner{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        public String next(){
            while(!st.hasMoreTokens()){
                try{
                    st = new StringTokenizer(br.readLine());
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        public int[] readArray(int n){
            int[] a = new int[n];
            for(int i=0; i<n; i++)a[i] = nextInt();
            return a;
        }
        public String nextLine(){
            String s = "";
            try{s = br.readLine().trim();}
            catch (Exception e){e.printStackTrace();}
            return s;
        }
        public int nextInt(){
            return Integer.parseInt(next());
        }
        public long nextLong(){
            return Long.parseLong(next());
        }
        public double nextDouble(){
            return Double.parseDouble(next());
        }
        public float nextFloat(){
            return Float.parseFloat(next());
        }
    }
}
