
/*
* Oj Name : UVA
* Problem No : 488
* Problem Name :  - Triangle Wave
* Time Limit : 3.00 Seconds
* RunTime : 0.260
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        while (testCase-- > 0){

            int n = sc.nextInt();
            int a = sc.nextInt();

            for(int k=1; k<=a; k++){

                for (int i=1; i<=n; i++){
					
                    for (int j=1; j<=i; j++){
                        System.out.print(i);
                    }
					
                    System.out.println();
                }
				
                for (int i=n-1; i>0; i--){
					
                    for (int j=i; j>0; j--){
                        System.out.print(i);
                    }
					
                    System.out.println();
                }

                System.out.println();
            }
        }
    }
}
