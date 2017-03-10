/*
* Oj Name : UVA
* Problem No : 488
* Problem Name :  - Triangle Wave
* Time Limit : 3.00 Seconds
* RunTime : 0.260
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        String[] amplitude = {"","1","22","333","4444","55555", "666666","7777777","88888888","999999999"};
        StringBuffer sb;

        for (int test=1; test <= testCase; test++){

            int a = sc.nextInt();
            int f = sc.nextInt();

            if(a==0){
                for (int i=1; i<f; i++){
                    System.out.println();
                    continue;
                }

            }

            if(f==0){
                System.out.println();
            }
            else {
                sb = new StringBuffer();

                for (int i=1; i<=a; i++){
                    sb.append(amplitude[i]);
                    sb.append("\n");
                }

                for (int i=a-1; i>0; i--){
                    sb.append(amplitude[i]);
                    sb.append("\n");
                }

                for (int j=0; j<f; j++)
                {
                    System.out.print(sb.toString());

                    if(test < (testCase-1)){
                        System.out.println();
                    }
                    else if((test == (testCase-1)) && (j <f-1)){
                        System.out.println();
                    }
                }
            }
        }
    }
}
