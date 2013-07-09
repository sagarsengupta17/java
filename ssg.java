import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int count=0;
    S n=new S();
       // String g="cdcdcdcdeeeef";
        Scanner z= new Scanner(System.in);
        String g=z.next();
        try{
        count=n.calc(g);
        }catch(Exception e){}
        finally{
  	System.out.println(count);
        if(count>1) System.out.println("YES");
        else  System.out.println("NO");
    }
    }
}
class S {
	int[] p={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	String d;
	int add=0,fact=1;
	public int calc(String k) throws Exception{
		for (int i = 0; i < k.length(); i++) {
			switch(k.charAt(i)){
			case 'a':p[0]++;break;
			case 'b':p[1]++;break;
			case 'c':p[2]++;break;
			case 'd':p[3]++;break;
			case 'e':p[4]++;break;
			case 'f':p[5]++;break;
			case 'g':p[6]++;break;
			case 'h':p[7]++;break;
			case 'i':p[8]++;break;
			case 'j':p[9]++;break;
			case 'k':p[10]++;break;
			case 'l':p[11]++;break;
			case 'm':p[12]++;break;
			case 'n':p[13]++;break;
			case 'o':p[14]++;break;
			case 'p':p[15]++;break;
			case 'q':p[16]++;break;
			case 'r':p[17]++;break;
			case 's':p[18]++;break;
			case 't':p[19]++;break;
			case 'u':p[20]++;break;
			case 'v':p[21]++;break;
			case 'w':p[22]++;break;
			case 'x':p[23]++;break;
			case 'y':p[24]++;break;
			case 'z':p[25]++;break;
			
			}
		}
			for (int j = 0; j < p.length; j++){
				//System.out.print(p[j]+" ");
				
			}
			for (int h = 0;  h< p.length; h++){
			if (p[h]!=0){
				add=add+(p[h]/2);
				fact=fact*facto((p[h]/2));
				
			}
			//System.out.println(facto(add)/fact);
			}
			int z=(facto(add)/fact);
		return z;
		
	}
	private int facto(int i) {
		// TODO Auto-generated method stub
		 int c, factq = 1;
		 
	      //System.out.println("Enter an integer to calculate it's factorial");
	      //Scanner in = new Scanner(System.in);
	 
//	      i = in.nextInt();
	 
	      if ( i < 0 )
          {   System.out.println("Number should be non-negative.");return 1;}
	      else
	      {
	         for ( c = 1 ; c <= i ; c++ )
	            factq = factq*c;
	 
	      //   System.out.println("Factorial of "+i+" is = "+factq);
	      }
		return factq;
	}
}
