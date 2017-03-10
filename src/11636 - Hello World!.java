
/*
* Oj Name : UVA
* Problem No : 11636
* Problem Name :  - Hello World!
* Time Limit : 1.00 Seconds
* RunTime : 0.220
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int totalCase = 1;

        while (true){
			
            int total = sc.nextInt();

            if(total < 0) break;

            int count = 0, i=1;

            while (i<total){
                i *= 2;
                count++;
            }

            System.out.println("Case " + totalCase++ + ": " + count);
        }
    }
}
