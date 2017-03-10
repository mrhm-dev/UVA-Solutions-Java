
/*
* Oj Name : UVA
* Problem No : 11332
* Problem Name :  - Summing DigitsNumbers
* Time Limit : 3.00 Seconds
* RunTime : 0.120
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        while (n != 0){
			
            long result = sumOfDigits(n);
            long temp = result;

            while (temp >= 10){
				
                result = sumOfDigits(temp);
                temp = result;
            }

            System.out.println(result);

            n = sc.nextLong();

        }

    }

    public static long sumOfDigits(long num){
		
        long temp = num;
        long sum = 0, rem;

        while (temp > 0){
            rem = (temp % 10);
            sum += rem;
            temp /= 10;
        }

        return sum;
    }
}
