
/*
* Oj Name : UVA
* Problem No : 369
* Problem Name :  - Combinations
* Time Limit : 3.00 Seconds
* RunTime : 0.190
*/

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
		
        while (true){
			
            int N = sc.nextInt();
            int M = sc.nextInt();

            if(N==0 && M==0) break;


            BigInteger result = (fact(N)).divide(fact(N-M).multiply(fact(M)));

            System.out.println( N + " things taken " + M + " at a time is " + result.toString() + " exactly.");
        }

    }

    private static BigInteger fact(int n){
		
        BigInteger fact = BigInteger.ONE;

        for(int i=1; i<=n; i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        return fact;
    }
}
