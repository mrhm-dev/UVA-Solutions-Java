

/*
* Oj Name : UVA
* Problem No : 10019 
* Problem Name : Funny Encryption Method
* Time Limit : 3.00 Seconds
* RunTime : 0.050
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
		
        Scanner cin = new Scanner(System.in);
        int tc = cin.nextInt();
		
        for(int d=0;d<tc;d++){
			
            int decimal = cin.nextInt();
            int bitCount1 = Integer.bitCount(decimal);
            int hexaDecimal = Integer.parseInt(Integer.toString(decimal), 16 );
            int bitCount2 = Integer.bitCount(hexaDecimal);
			
            System.out.println(bitCount1 + " " + bitCount2);
        }
    }
}
