import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
public class BeatyYear {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
       
		int curr = fs.nextInt();
        int temp=curr+1;
        for(int i=temp;i<90000;i++){
            Map<Integer,Integer> map = new HashMap<>();
            int val=i;
            while(val>0){
            int last =val%10;
            map.put(last,map.getOrDefault(last, 0)+1);
            val =val/10;
        }
        int count =0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue()>1){
                break;
            }else{
                count++;
            }
          }
          if(count==4){
            out.println(i);
            break;
          }
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
