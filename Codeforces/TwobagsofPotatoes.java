<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
import java.util.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 
import java.io.*;
public class TwobagsofPotatoes{

	public static void main(String [] args){

		FastReader input = new FastReader();
		int y,k,n;
		y = input.nextInt();
		k = input.nextInt();
		n = input.nextInt();
		int x = (y/k)+1;
	int flag = 1;
	 while(x*k <= n){

                    System.out.print((x*k - y)+" ");
                    flag = 0;
                    x++;
                }
                if(flag==1)
                    System.out.print(-1);
	}
	
	 static class FastReader 
	    { 
	        BufferedReader br; 
	        StringTokenizer st; 
	  
	        public FastReader() 
	        { 
	            br = new BufferedReader(new
	                     InputStreamReader(System.in)); 
	        } 
	  
	        String next() 
	        { 
	            while (st == null || !st.hasMoreElements()) 
	            { 
	                try
	                { 
	                    st = new StringTokenizer(br.readLine()); 
	                } 
	                catch (IOException  e) 
	                { 
	                    e.printStackTrace(); 
	                } 
	            } 
	            return st.nextToken(); 
	        } 
	  
	        int nextInt() 
	        { 
	            return Integer.parseInt(next()); 
	        } 
	  
	        long nextLong() 
	        { 
	            return Long.parseLong(next()); 
	        } 
	  
	        double nextDouble() 
	        { 
	            return Double.parseDouble(next()); 
	        } 
	  
	        String nextLine() 
	        { 
	            String str = ""; 
	            try
	            { 
	                str = br.readLine(); 
	            } 
	            catch (IOException e) 
	            { 
	                e.printStackTrace(); 
	            } 
	            return str; 
	        } 
	    } 
	
<<<<<<< HEAD
=======
=======
import java.util.*;
import java.io.*;
public class TwobagsofPotatoes{

	public static void main(String [] args){

		Scanner input = new Scanner(System.in);
		int y,k,n;
		y = input.nextInt();
		k = input.nextInt();
		n = input.nextInt();
		int x = (y/k)+1;
	int flag = 1;
	 while(x*k <= n){

                    System.out.print((x*k - y)+" ");
                    flag = 0;
                    x++;
                }
                if(flag==1)
                    System.out.print(-1);
	}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
>>>>>>> 7c3d9a578623ace8c9a3e1cfe7b1db27907a676f
}