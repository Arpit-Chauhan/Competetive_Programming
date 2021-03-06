import java.io.*;
import java.util.*;


public class Fence {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j,k;
        String s;

        n = sc.nextInt();
        k = sc.nextInt();
        int arr[] = sc.readArray(n);
        int ans=windowSliding(arr,n,k);
        out.println(ans);

        out.close();
    }


    public static int windowSliding(int arr[],int n,int k) {
        int i,currsum,res,j;
        currsum=0;
        res=Integer.MAX_VALUE;
        int pos=0;
        for(i=0;i<k;i++) {
            currsum+=arr[i];
        }
        res=Math.min(currsum, res);
        for(i=k;i<n;i++) {
            currsum+=(arr[i]-arr[i-k]);
            if (currsum<res){
                res=currsum;
                pos=i-k+1;
            }
        }
        return (pos+1);
    }



    /*
		FASTREADER
	*/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        /*DEFINED BY ME
         */
        int[] readArray(int n) {

            int arr[] = new int[n];

            for (int i = 0; i < n; i++)
                arr[i] = nextInt();

            return arr;
        }

        void sort(int arr[]) {
            ArrayList<Integer> l = new ArrayList<>();
            for (int i : arr)
                l.add(i);
            Collections.sort(l);
            for (int i = 0; i < arr.length; i++)
                arr[i] = l.get(i);
        }
    }
}