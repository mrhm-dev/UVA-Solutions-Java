
/*
* Oj Name : UVA
* Problem No : 10106
* Problem Name :  - Product
* Time Limit : 3.00 Seconds
* RunTime : 0.060
*/

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){

            String num1 = sc.nextLine();
            String num2 = sc.nextLine();

            BigInteger n1 = new BigInteger(num1);
            BigInteger n2 = new BigInteger(num2);
            BigInteger pro = n1.multiply(n2);

            System.out.println(pro.toString());
        }
    }
}
