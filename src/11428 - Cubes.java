/*
* Oj Name : UVA
* Problem No : 11428 
* Problem Name : Cubes
* Time Limit : 1.00 Seconds
* RunTime : 0.040
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
		
        while (n != 0){
			
            int r1=0, r2=0;
            boolean check = false;

            for(int i=1; i<=Math.sqrt(n); i++){
                for (int j=1; j<= i-1; j++){
					
                    if(Math.pow(i,3)-Math.pow(j,3) == n){
						
                        r1 = i;
                        r2 = j;
                        check = true;
                        break;
                    }

                }
				
                if(check) break;
            }

            if(r1 != 0){
                System.out.println(r1 + " " + r2);
            }
            else System.out.println("No solution");

            n = Integer.parseInt(br.readLine());
        }
    }
}
