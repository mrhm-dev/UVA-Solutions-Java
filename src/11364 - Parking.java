
/*
* Oj Name : UVA
* Problem No : 11364 
* Problem Name : Parking
* Time Limit : 1.00 Seconds
* RunTime : 0.090
*/


import java.util.Scanner;

public class Parking11364 {

    static short testCases, shops;
    static short min;
    static short max;
    static short val;
    static Scanner sc;

    public static void main(String[] args) {
		
        sc = new Scanner(System.in);
        testCases = sc.nextShort();
		
        while((testCases--) != 0) {
			
            shops = sc.nextShort();
            min = 100;
            max = 0;
			
            while((shops--) != 0) {
				
                val = sc.nextShort();
                if(val > max) max = val;
                if(val < min) min = val;
            }
			
            System.out.println((max - min) * 2);
        }
    }
}
