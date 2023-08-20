import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Template {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int T = fs.nextInt();
        for (int tt = 0; tt < T; tt++) {
			int n = fs.nextInt(), k = fs.nextInt(), maxTemp = fs.nextInt();
			int[] a = fs.readArray(n);
			long ways = 0;
			long size = 0;
			for(int i:a){
                if(i<=maxTemp){
                    size++;
                }else{
                   size-=k;
                   if(size>=0){
                    ways+=(size+1)*(size+2)/2;
                   }
                   size=0;
                }
            }
            size-=k;
            if(size>=0){
                ways+=(size+1)*(size+2)/2;
            }
            out.println(ways);
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
