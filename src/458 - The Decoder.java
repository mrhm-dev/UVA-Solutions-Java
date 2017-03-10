
/*
* Oj Name : UVA
* Problem No : 458
* Problem Name :  - The Decoder
* Time Limit : 3.00 Seconds
* RunTime : 0.160
*/

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{

        DataInputStream in = new DataInputStream(System.in);
        DataOutputStream out = new DataOutputStream(System.out);
		
        int h = 0;
        while ((h = in.read()) != -1) {
			
            out.write((Character.isSpace((char) h) ? h : (h - 7)));
        }

    }
}
