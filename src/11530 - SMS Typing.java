
/*
* Oj Name : UVA
* Problem No : 11530
* Problem Name :  - SMS Typing
* Time Limit : 1.00 Seconds
* RunTime : 0.030
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        for(int t=1; t<=testCase; t++){
			
            String line = br.readLine();
            int count = 0;

            for (int i=0; i<line.length(); i++){
                switch (line.charAt(i)){
                    case 'a':
                    case 'd':
                    case 'g':
                    case 'j':
                    case 'm':
                    case 'p':
                    case 't':
                    case 'w':
                    case ' ':
                        count += 1;
                        break;

                    case 'b':
                    case 'e':
                    case 'h':
                    case 'k':
                    case 'n':
                    case 'q':
                    case 'u':
                    case 'x':
                        count += 2;
                        break;

                    case 'c':
                    case 'f':
                    case 'i':
                    case 'l':
                    case 'o':
                    case 'r':
                    case 'v':
                    case 'y':
                        count += 3;
                        break;

                    case 's':
                    case 'z':
                        count += 4;
                        break;
                }
            }

            System.out.println("Case #" + t + ": " + count);
        }
    }
}
