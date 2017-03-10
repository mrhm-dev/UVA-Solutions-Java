

import java.io.IOException;
import java.util.Scanner;

public class N3100 {

    private final int MAX = 1000000; 

    public static void main(String args[]) throws IOException{
		
        N3100 obj = new N3100();
        obj.beginProcess();
    }

    void beginProcess() throws IOException {
        Scanner in = new Scanner(System.in);

        while(in.hasNextInt()){
            int i = in.nextInt();
            int j = in.nextInt();

            int from = Math.min(i, j);
            int to = Math.max(i, j);

            if(from>0 && from<MAX && to>0 && to<MAX){
                int max = 0;

                for(int ii=from; ii<=to; ii++){
                    max = Math.max(max, processCycleTotal(ii, 1));
                }

                System.out.println(i+" "+j+" "+max);
            }
        }
    }

    int processCycleTotal(int n, int length){
		
        if(n > 1){
            if(n%2 == 0){
                n = n/2;
            }else{
                n = (3 * n) + 1;
            }

            length++;

            return processCycleTotal(n, length);
        }else{
            return length;
        }
    }
}
