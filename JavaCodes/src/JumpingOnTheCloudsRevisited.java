import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.StringTokenizer;

import static java.lang.System.*;

public class JumpingOnTheCloudsRevisited {
    public static void main(String[] args){
        FastScaner fs = new FastScaner();
        int n = fs.nextInt(), k = fs.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i] = fs.nextInt();
        }
        int energy = 100, cur = 0;

        //make first move
        cur = (cur + k) % n;
        if(array[cur] == 0){
            energy--;
        }
        else if(array[cur] == 1){
            energy = energy - 3;
        }
        while(true){
            if(cur == 0) break;
            cur = (cur + k) % n;
            if(array[cur] == 0){
                energy--;
            }
            else if(array[cur] == 1){
                energy = energy - 3;
            }
        }
        out.printf("%d\n", energy);
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
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
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
