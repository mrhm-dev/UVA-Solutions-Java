
/*
* Oj Name : UVA
* Problem No : 294
* Problem Name : Divisors
* Time Limit : 3.00 Seconds
* RunTime : 0.160
*/

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);

        int tests = sc.nextInt();

        for (int test = 0; test < tests; test++) {

            int L = sc.nextInt();
            int U = sc.nextInt();
            int maxDivisorCount = 0, maxNumber = 0;

            for (int i = L; i <= U; i++) {

                int currentDivisorCount = divisorCount(i);

                if (currentDivisorCount > maxDivisorCount) {

                    maxDivisorCount = currentDivisorCount;
                    maxNumber = i;
                }
            }
            out.printf("Between %d and %d, %d has a maximum of %d divisors.\n", L, U, maxNumber, maxDivisorCount);

        }
    }

    public static int divisorCount(int n) {
		
        if (n == 1)
            return 1;

        int count = 0;

        int sqrt = (int)Math.sqrt(n);

        for (int i = 1; i <= sqrt; i++)
            if (n % i == 0)
                count += 2;

        if (sqrt * sqrt == n)
            count--;

        return count;
    }


}
