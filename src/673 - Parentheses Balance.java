
/*
* Oj Name : UVA
* Problem No : 673 
* Problem Name : Parentheses Balance
* Time Limit : 3.00 Seconds
* RunTime : 0.430
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- > 0){
            String line = br.readLine();

            if (checker(line))
                System.out.println("Yes");
            else System.out.println("No");

        }

    }

    public static boolean checker(String str){
        char[] chars = str.toCharArray();
        Stack<Integer> stack = new Stack<>();

        for (char c : chars){

            if (c == '('){
                stack.push(0);
            }
            else if(c == '['){
                stack.push(1);
            }
            else if(c == ')'){
                if (stack.isEmpty()){
                    return false;
                }
                if (stack.pop() != 0){
                    return false;
                }
            }
            else if(c == ']'){
                if (stack.isEmpty()){
                    return false;
                }
                if (stack.pop() != 1){
                    return false;
                }
            }

        }

        return stack.isEmpty();
    }
}
