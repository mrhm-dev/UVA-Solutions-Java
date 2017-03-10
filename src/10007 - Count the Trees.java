/*
* Oj Name : UVA
* Problem No : 10007
* Problem Name : Count the Trees
* Time Limit : 3.00 Seconds
* RunTime : 0.140
*/

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static BigInteger factorial (int n) {
		
        BigInteger curr = BigInteger.ONE;
		
        for(int i=1;i<=n;i++){
			
            curr = curr.multiply(BigInteger.valueOf(i));
        }
		
        return curr;
    }
    public static void main (String[] args) {
		
        Scanner cin = new Scanner(System.in);
		
        while(cin.hasNext()){
			
            int n = cin.nextInt();
			
            if (n==0) break;
			
            BigInteger answer = factorial(2*n).divide(factorial(n+1));
			
            System.out.println(answer.toString());
        }
    }
}

