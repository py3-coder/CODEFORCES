import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Hulk {
  public static void main(String[] args) {
    FastScanner fs = new FastScanner();
    PrintWriter out = new PrintWriter(System.out);
    int n = fs.nextInt();
    String love = "I love";
    String hate = "I hate";
    String res = "";
    int j = 1;
    while (j <= n) {
      if (j % 2 != 0 && j != n) {
        res += hate + " ";
        res += "that ";
      } else if (j % 2 != 0 && j == n) {
         res += hate + " ";
       } else if (j % 2 == 0 && j == n) {
        res += love + " ";
        }
       else if(j%2==0 && j!=n ){
        res += love + " ";
        res += "that ";
      }
      
      j++;
    }
    out.println(res + "it");
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
