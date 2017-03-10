
/*
* Oj Name : UVA
* Problem No : 11547
* Problem Name : Automatic Answer
* Time Limit : 1.00 Seconds
* RunTime : 0.060
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
		
        int testCase = sc.nextInt();

        while (testCase-- > 0){
			
            int n = sc.nextInt();

            n *= 567;
            n /= 9;
            n += 7492;
            n *= 235;
            n /= 47;
            n -= 498;

            n/=10;
            int temp = n%10;

            System.out.println(Math.abs(temp));

        }
    }
}
