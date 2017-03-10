
/*
* Oj Name : UVA
* Problem No : 11185
* Problem Name :  - Ternary
* Time Limit : 3.00 Seconds
* RunTime : 0.080
*/

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while (true){
			
            long number = sc.nextLong();
            if (number < 0) break;
            Stack<Long> stack = new Stack<>();

            while (number != 0){
				
                long temp = number%3;
                stack.push(temp);
                number /= 3;
            }

            if (stack.isEmpty()) 
				System.out.print(0);
			
            while (!(stack.isEmpty())){
				
                System.out.print(stack.pop());
            }

            System.out.println();

        }

    }

}
