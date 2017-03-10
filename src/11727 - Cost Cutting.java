
/*
* Oj Name : UVA
* Problem No : 11727
* Problem Name :  - Cost Cutting
* Time Limit : 1.00 Seconds
* RunTime : 0.050
*/


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int k=1; k<=testCase; k++){
			
            int[] salary = new int[3];
			
            for(int i=0; i<salary.length; i++){
                int x = sc.nextInt();
                salary[i] = x;
            }

            Arrays.sort(salary);
            System.out.println("Case " + k + ": " + salary[1]);
        }
    }
}
