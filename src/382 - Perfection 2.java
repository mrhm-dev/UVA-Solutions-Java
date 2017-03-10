

/*
* Oj Name : UVA
* Problem No : 382 
* Problem Name : Perfection
* Time Limit : 3.00 Seconds
* RunTime : 0.050
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        long [] nums = new long[101];
        int i=0;
        while (true){
            long n = sc.nextLong();
            if(n==0) break;
            nums[i++] = n;
        }

        System.out.println("PERFECTION OUTPUT");

        for (int j=0; j<i; j++){

            long x = nums[j];

            if(x == sumOfDivisors(x))
                System.out.printf("%5d  %s\n", x, "PERFECT");
            else if(x < sumOfDivisors(x))
                System.out.printf("%5d  %s\n", x, "ABUNDANT");
            else if (x > sumOfDivisors(x))
                System.out.printf("%5d  %s\n", x, "DEFICIENT");
        }

        System.out.println("END OF OUTPUT");

    }

    public static long sumOfDivisors(long n){
		
        long sum = 0;
        for (int i=1; i<n; i++){
            if(n%i == 0)
                sum+=i;
        }

        return sum;
    }
}
