
/*
* Oj Name : UVA
* Problem No : 10370
* Problem Name :  - Above Average
* Time Limit : 3.00 Seconds
* RunTime : 0.160
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        while (testCase-- > 0){
			
            int sum = 0, avg = 0, count=0;
            int size = sc.nextInt();
            int [] numbers = new int[size];
			
            for (int i=0; i<numbers.length; i++){
                numbers[i] = sc.nextInt();
                sum+=numbers[i];
            }

            avg = sum/numbers.length;

            for(int x : numbers){
                if(x > avg) count++;
            }

            double result = (100.0*count)/size;

            System.out.printf("%.3f%%\n", result);

        }
    }
}
