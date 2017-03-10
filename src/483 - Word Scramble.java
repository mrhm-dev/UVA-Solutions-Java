
/*
* Oj Name : UVA
* Problem No : 483
* Problem Name :  - Word Scramble
* Time Limit : 3.00 Seconds
* RunTime : 0.070
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        StringBuffer sb;

        while (sc.hasNext()){
			
            String text = sc.nextLine();
            String [] texts = text.split(" ");

            for (int i=0; i<texts.length; i++){
				
                sb = new StringBuffer(texts[i]);

                if(i==texts.length -1){
                    System.out.print(sb.reverse().toString());
                    break;
                }
				
                sb.reverse().toString();
                System.out.print(sb + " ");
            }
			
            System.out.println();
        }
    }
}
