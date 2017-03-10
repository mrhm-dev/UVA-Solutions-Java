

/*
* Oj Name : UVA
* Problem No : 10071
* Problem Name :  - Back to High School Physics
* Time Limit : 3.00 Seconds
* RunTime : 0.040
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
		
        Scanner in=new Scanner (System.in);
		
        while(in.hasNext())
        {
            int a=in.nextInt();
            int b=in.nextInt();

            int res = a*b*2;

            System.out.println(res);

        }
    }
}
