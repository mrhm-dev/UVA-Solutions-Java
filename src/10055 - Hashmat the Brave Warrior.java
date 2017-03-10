

/*
* Oj Name : UVA
* Problem No : 10055
* Problem Name :  - Hashmat the Brave Warrior
* Time Limit : 3.00 Seconds
* RunTime : 1.300
*/


import java.util.Scanner;

public class Main {

    public static void main(String[] args){
		
        Scanner in=new Scanner (System.in);
		
        while(in.hasNext())
        {
            long a=in.nextLong();
            long b=in.nextLong();
            if(a>b)
                System.out.println(a-b);
            else
                System.out.println(b-a);

        }
    }
}
