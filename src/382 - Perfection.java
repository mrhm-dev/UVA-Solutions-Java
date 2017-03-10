

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

        System.out.println("PERFECTION OUTPUT");

        while (true){
			
            long n = sc.nextLong();
			
            if(n==0){
                System.out.println("END OF OUTPUT");
                break;
            }

            long sum = 0;

            for (int i=1; i<n; i++){
                if(n%i == 0)
                    sum += i;
            }

            if(n == sum)
                System.out.printf("%5d  %s\n", n, "PERFECT");
            else if(n < sum)
                System.out.printf("%5d  %s\n", n, "ABUNDANT");
            else if (n > sum)
                System.out.printf("%5d  %s\n", n, "DEFICIENT");
        }
    }

}
