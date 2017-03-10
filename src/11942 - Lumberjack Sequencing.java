
/*
* Oj Name : UVA
* Problem No : 11942
* Problem Name :  - Lumberjack Sequencing
* Time Limit : 1.00 Seconds
* RunTime : 0.060
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for(int t=1; t<=testCase; t++){

            int [] nums = new int[10];
            boolean check = true;
            for(int i=0; i<10; i++){
                nums[i] = Integer.parseInt(br.readLine());
            }

            for(int i=0; i<10; i++){
                for(int j=i+1; j<10-1; j++){
                    if(nums[i] > nums[j]){
                        check = false;
                        break; // Not complete
                    }

                    if(!check) break;
                }
            }

            System.out.println("Lumberjacks:");

            if(check)
                System.out.println("Ordered");
            else System.out.println("Unordered");

        }
    }
}
