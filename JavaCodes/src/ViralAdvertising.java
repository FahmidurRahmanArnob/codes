import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.StringTokenizer;

public class ViralAdvertising {
    public static void main(String[] args){
        FastScaner fs = new FastScaner();
        int n = fs.nextInt();
        int m = 5;
        int total = 0;
        for(int i=0; i<n; i++){
            m /= 2;
            total += m;
            m *= 3;
        }
        System.out.println(total);
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
