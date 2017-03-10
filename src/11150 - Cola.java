/*
* Oj Name : UVA
* Problem No : 11150
* Problem Name : Cola
* Time Limit : 3.00 Seconds
* RunTime : 0.100
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
		
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){

            int n = sc.nextInt();
            int half, sum;

            half = n/2;
            sum = half+n;

            System.out.println(sum);
        }
    }
}

