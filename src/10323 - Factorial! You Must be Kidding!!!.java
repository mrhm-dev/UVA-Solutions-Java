
/*
* Oj Name : UVA
* Problem No : 10323
* Problem Name :  - Factorial! You Must be Kidding!!!
* Time Limit : 3.00 Seconds
* RunTime : 0.760
*/

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String args[]){
		
        Scanner sc = new Scanner(System.in);
        BigInteger a , r;
        int n;

        while(sc.hasNextInt()){
			
            n = sc.nextInt();
			
            if(n < 0){
                n = Math.abs(n);
                if(n%2 == 0)
                    System.out.println("Underflow!");
                else System.out.println("Overflow!");
            }
            else if(n < 8)
                System.out.println("Underflow!");
            else if(n >= 14)
                System.out.println("Overflow!");
            else{
                a = new BigInteger("1");
                r = new BigInteger("1");
                int i = 1;
                while(i <= n){
                    r = r.multiply(a);
                    a = a.add(new BigInteger("1"));
                    i++;
                }
                System.out.println(r);
            }
        }
		
        sc.close();
    }
}

