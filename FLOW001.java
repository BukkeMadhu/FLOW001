

import java.util.Scanner;


// Remember that the class name should be "Main" and should be "public".
public class Main {
	public static void main(String[] args) {
		// System.in and System.out are input and output streams, respectively.
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		if(t>=1 && t<=1000){
		    int i = 1;
		    while(i<=t){
		        int a = sc.nextInt();
		        int b = sc.nextInt();
		        System.out.println(a+b);
		        i++;
		    }
		        
		 }
		    
		
	}
}