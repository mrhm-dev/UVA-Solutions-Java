
/*
* Oj Name : UVA
* Problem No : 10018
* Problem Name :  - Reverse and Add
* Time Limit : 3.00 Seconds
* RunTime : 0.120
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- > 0){

            int count = 0;
            String number, revers;

            number = br.readLine();

            do{
                count++;

                revers = new StringBuffer(number).reverse().toString();

                number = "" + (Long.parseLong(number)+ Long.parseLong(revers));

            }while (!number.equals(new StringBuffer(number).reverse().toString()));

            System.out.println(count + " " + number);
        }

    }

}
