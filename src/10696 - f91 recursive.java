

/*
* Oj Name : UVA
* Problem No : 10696
* Problem Name : F91
* Time Limit : 3.00 Seconds
* RunTime : 1.520
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;

        while (!(s=br.readLine()).equals("0")){
            int num = Integer.parseInt(s);
            System.out.printf("f91(%d) = %d\n", num, f91(num));
        }

    }

    public static int f91(int n){

        if(n <= 100)
            return f91(f91(n+11));
        else
            return n-10;
    }
}
