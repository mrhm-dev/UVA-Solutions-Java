
/*
* Oj Name : UVA
* Problem No : 424
* Problem Name :  - Integer Inquiry
* Time Limit : 3.00 Seconds
* RunTime : 0.030
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger bg = BigInteger.ZERO;

        while (true){
			
            String num = br.readLine();

            if (num.equals("0")) break;

            BigInteger n = new BigInteger(num);
            bg = bg.add(n);

        }

        System.out.println(bg.toString());
    }
}
