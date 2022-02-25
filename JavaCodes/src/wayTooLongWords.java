import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.StringTokenizer;

public class wayTooLongWords {
    public static void main(String[] args){
        FastScaner fs = new FastScaner();
        int T = fs.nextInt();
        for(int tt=0; tt<=T; tt++){
            String str = fs.nextLine();
            if(str.length() > 10){
                //jeitar length 10 er cheye kom oita direct print kortese else statement;
                //jeitar length 10 er cheye beshi oitar first word and last word print kortese ei if statement;
                //so basically here i'm gonna output the first letter and the length-2th letter;
                System.out.print(str.charAt(0));
                System.out.print(str.length() - 2);
                System.out.println(str.charAt(str.length() - 1));
            }
            else{
                System.out.println(str);
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
            try{
                s = br.readLine().trim();
            }catch (Exception e){
                e.printStackTrace();
            }
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
