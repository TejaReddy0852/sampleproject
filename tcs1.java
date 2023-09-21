package java_flm;
import java.util.*;

public class tcs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("provide a numbers");
        int N=sc.nextInt();
        while(N>0) {
        	int rem=N%10;
        	if(rem%2==0) {
        		count++;
        		System.out.println(""+count);
        	}
        	N=N/10;
        }
        if(count>=3) {
        	System.out.println("True");
        }else {
            System.out.println("false");}
        
	}

}
