import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.StringTokenizer;

public class AppendAndDelete {
    public static void main(String[] args){
        FastScaner fs = new FastScaner();
        String s = fs.next(), t = fs.next();
        int k = fs.nextInt();
        int sLength = s.length();
        int tLength = t.length();
        int lastCommon = -1;
        while(lastCommon + 1 < sLength && lastCommon + 1 < tLength && s.charAt(lastCommon + 1) == t.charAt(lastCommon + 1)){
            lastCommon++;
        }
        if(lastCommon == -1){
            //If strings are different
            if(k >= tLength + sLength){//If k more than target length and remainder is even
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        else{
            int sDiff = sLength - lastCommon - 1;
            int tDiff = tLength - lastCommon - 1;
            if(k >= tLength + sLength){
                System.out.println("Yes");
            }
            else if(k >= sDiff + tDiff && (k - sDiff - tDiff) % 2 == 0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
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
