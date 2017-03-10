/*
* Oj Name : UVA
* Problem No : 11172
* Problem Name :  - Relational Operator
* Time Limit : 3.00 Seconds
* RunTime : 0.050
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
		
        InputStreamReader In = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(In);

        int testCase = Integer.parseInt(br.readLine());
		
        for(int i=1; i<=testCase; i++){
			
            long a = Integer.parseInt(br.readLine());
            long b = Integer.parseInt(br.readLine());

            if(a > b) 
				System.out.println(">");
			
            if(a < b) 
				System.out.println("<");
			
            if(a==b) 
				System.out.println("=");
        }
    }
}
