

/*
* Oj Name : UVA
* Problem No : 10424 
* Problem Name : Love Calculator
* Time Limit : 3.00 Seconds
* RunTime : 0.060
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        while (true) {
            String x = "";

            try {

                x = s.nextLine();

            } catch (Exception e) {
                break;
            }

            String y = s.nextLine();
            x = x.toLowerCase();
            y = y.toLowerCase();

            int sumY = find(y);
            int sumX = find(x);

            if (sumX == 0 || sumY == 0) {
                System.out.println("0.00 %");
            }
            if (sumX > sumY) {
                double temp = sumY * 100.0 / sumX;
                System.out.printf("%.2f %%%n", temp);
            } else {

                double temp = sumX * 100.0 / sumY;
                System.out.printf("%.2f %%%n", temp);


            }
        }
    }

    static int find(String in) {
		
        int sum = 0;
		
        for (int i = 0; i < in.length(); i++) {
			
            if (in.charAt(i) - 96 > 0 && in.charAt(i) - 96 < 27) {
                sum += in.charAt(i) - 96;
            }
        }
        int result = 0;
        result = summs(sum);
		
        return result;
    }

    public static int summs(int temp) {
		
        int sum = temp;
        int result = 0;
		
        while (sum > 0) {
			
            result += sum % 10;
            sum /= 10;
        }
		
        if (result > 9) {
            result = summs(result);
        }
		
        return result;
    }
}
