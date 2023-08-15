//A. United We Stand
import java.util.*;

public class United {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int len  = sc.nextInt();
            int[] arr = new int[len];
            int counte =0;
            int counto=0;
            ArrayList<Integer> bodd= new ArrayList<>();
            ArrayList<Integer> ceven= new ArrayList<>();
            for(int i=0;i<len;i++){
                arr[i]=sc.nextInt();
                if(arr[i]%2!=0){
                    counto++;
                    bodd.add(arr[i]);
                }else{
                    counte++;
                    ceven.add(arr[i]);
                }
            }
            if(counte==arr.length || counto==arr.length){
                boolean flag = Arrays.stream(arr).distinct().count() == 1;
                if(flag==true){
                System.out.println(-1);
                continue;
                }
                Arrays.sort(arr);
                int k=arr[0];
                ArrayList<Integer> b=new ArrayList<>();
                ArrayList<Integer> c=new ArrayList<>();
                for(int j=0;j<arr.length;j++){
                    if(k==arr[j]){
                        b.add(arr[j]);
                    }else{
                        c.add(arr[j]);
                    }
                }
                System.out.println(b.size()+" "+c.size());
                for(int ele:b){
                    System.out.print(ele+" ");
                }
                System.out.println();
                for(int ele:c){
                    System.out.print(ele+" ");
                }
            }else{
                System.out.println(bodd.size()+" "+ceven.size());
                for(int ele:bodd){
                    System.out.print(ele+" ");
                }
                System.out.println();
                for(int ele:ceven){
                    System.out.print(ele+" ");
                }
            }
        }
    }
}
