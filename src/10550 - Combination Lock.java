
/*
* Oj Name : UVA
* Problem No : 10550
* Problem Name :  - Combination Lock
* Time Limit : 3.00 Seconds
* RunTime : 0.130
*/

import java.util.Scanner;

public class CombinationLock10550 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while (true){
			
            int inital, first, second, last, sum=1080;

            inital = sc.nextInt();
            first = sc.nextInt();
            second = sc.nextInt();
            last = sc.nextInt();

            if(inital==0 && first==0 && second==0 && last==0) break;

            sum += (inital - first) > 0 ? (inital-first)*9 : (inital-first+40)*9;
            sum += (second - first) > 0 ? (second-first)*9 : (second-first+40)*9;
            sum += (second - last) > 0 ? (second-last)*9 : (second-last+40)*9;

            System.out.println(sum);
        }
    }
}

