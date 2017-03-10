/*
* Oj Name : UVA
* Problem No : 11000 
* Problem Name : Bee
* Time Limit : 3.00 Seconds
* RunTime : 0.030
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
		
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
		
        StringBuilder sb = new StringBuilder("");
		
        long [] bee = new long[46];
        bee[0] = 0;
        bee[1] = 1;
		
        for(int i=2; i<46; i++){
			
            bee[i] = bee[i-1] + (bee[i-2]) + 1;
        }
		
        String m="";
		
        while(true){
			
            m=br.readLine();
            int x=Integer.parseInt(m);
            if(x==-1)
                break;
			
            sb.append(bee[x]).append(" ").append(bee[x+1]).append("\n");
        }
		
        System.out.print(sb);
    }
}


