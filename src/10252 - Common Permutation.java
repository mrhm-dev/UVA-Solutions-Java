
/*
* Oj Name : UVA
* Problem No : 10252
* Problem Name :  - Common Permutation
* Time Limit : 3.00 Seconds
* RunTime : 0.030
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
			
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            String str = "";


            for (int i=0; i<str1.length(); i++){
				
                for (int j=0; j<str2.length(); j++){
					
                    if(str1.charAt(i) == str2.charAt(j)){
                        str += str1.charAt(i);
                    }
                }
            }

            char [] chars = str.toCharArray();
            String s = "";
			
            Set<Character> pres = new HashSet<>();
			
            for (char c : chars){
                if (pres.add(c)){
                    s += c;
                }
            }

            Arrays.sort(chars);
            System.out.println(new String(chars));

        }
    }
}
