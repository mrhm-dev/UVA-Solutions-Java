/*
* Oj Name : UVA
* Problem No : 713
* Problem Name : Adding Reversed Numbers
* Time Limit : 3.00 Seconds
* RunTime : 0.090
*/

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BigInteger n1,n2,sum;
		
		StringBuffer sb;
		
        int tc;

        tc = sc.nextInt();

        while(tc > 0){
            sb = new StringBuffer(sc.next());
            sb = sb.reverse();
            n1 = new BigInteger(sb.toString());
			
            sb = new StringBuffer(sc.next());
            sb = sb.reverse();
            n2 = new BigInteger(sb.toString());

            sum = n1.add(n2);
            sb = new StringBuffer(sum.toString());
            sb = sb.reverse();
            sum = new BigInteger(sb.toString());

            System.out.println(sum);

            tc--;
        }
    }
}
