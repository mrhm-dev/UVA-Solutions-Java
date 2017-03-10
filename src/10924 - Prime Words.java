
/*
* Oj Name : UVA
* Problem No : 10924
* Problem Name :  - Prime Words
* Time Limit : 3.00 Seconds
* RunTime : 0.060
*/


import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
			
            String str = sc.nextLine();
            char[] strChar = str.toCharArray();
            int sum = 0;

            for (char ch : strChar){
                if((int)ch >=65 && (int)ch <=91){
                    int n = (int)ch - 38;
                    sum += n;
                }
                else if((int)ch >= 97 && (int)ch <= 122){
                    int n = (int)ch - 96;
                    sum += n;
                }
            }

            if(isPrime(sum))
                System.out.println("It is a prime word.");
            else
                System.out.println("It is not a prime word.");

        }

    }

    public static boolean isPrime(int x){
		
        if (x==1) {
            return true;
        }
        else {
            for (int i = 2; i <= Math.sqrt(x); i++) {

                if (x % i == 0) return false;
            }
            return true;
        }
    }
}
