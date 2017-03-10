
/*
* Oj Name : UVA
* Problem No : 10110
* Problem Name :  - Light, more light
* Time Limit : 3.00 Seconds
* RunTime : 0.910
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
		
        Scanner sc = new Scanner(System.in);

        while (true){
			
            long n = sc.nextLong();

            if (n==0) break;

            long x = (long)Math.sqrt(n);

            if(x*x == n)
                System.out.println("yes");
            else
                System.out.println("no");

        }
    }
}
