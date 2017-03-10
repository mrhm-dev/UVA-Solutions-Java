/*
* Oj Name : UVA
* Problem No : 11936
* Problem Name :  - The Lazy Lumberjacks
* Time Limit : 1.00 Seconds
* RunTime : 0.060
*/


import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        while (testCase-- > 0){
			
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if((a+b) > c && (a+c) > b && (b+c) > a){
                System.out.println("OK");
            }else
                System.out.println("Wrong!!");
        }

        sc.close();
    }
}
