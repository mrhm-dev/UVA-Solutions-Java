/*
* Oj Name : UVA
* Problem No : 11462
* Problem Name : Age Sort
* Time Limit : 5.00 Seconds
* RunTime : 4.040
*/

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n;

        while (true){
			
            n = sc.nextInt();
			
            if(n==0)
				break;

            int [] ages = new int[n];
			
            for (int i=0, j=0; j<ages.length; i++){
				
                int x = sc.nextInt();
				
                if(x>=1 && x<100)
                    ages[j++] = x;
            }
			
            Arrays.sort(ages);

            for(int i=0; i<ages.length; i++){
				
                if(i==0)
                    System.out.print(ages[i]);
				
                else 
					System.out.print(" " + ages[i]);
            }
			
            System.out.println();
        }
    }
}
