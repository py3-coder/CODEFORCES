import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Escalator {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int T = fs.nextInt();
        for (int tt = 0; tt < T; tt++) {
			int n = fs.nextInt(),m=fs.nextInt(), k = fs.nextInt(), h = fs.nextInt();
            int maxlimit =k*m;
			int[] a = fs.readArray(n);
            int count=0;
			for(int i:a){
                int val =Math.abs(h-i);
                if(val>=k && val<maxlimit && val%k==0){
                    count++;
                }
            }
            out.println(count);
    }
    out.close();
}
    static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");
 
		String next() {
			while (!st.hasMoreTokens())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
 
		int nextInt() {
			return Integer.parseInt(next());
		}
 
		int[] readArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}
 
		long nextLong() {
			return Long.parseLong(next());
		}
	}
}
