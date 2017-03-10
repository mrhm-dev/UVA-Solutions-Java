
/*
* Oj Name : UVA
* Problem No : 10815
* Problem Name :  - Andy's First Dictionary
* Time Limit : 3.00 Seconds
* RunTime : 0.170
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws IOException{
		
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line, aux;
        HashSet<String> dictionary = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();
        int i;
		
        while ((line = in.readLine()) != null){
			
            aux = "";
            for (i=0; i<line.length(); i++) {
				
                if (Character.isLetter(line.charAt(i))){
                    aux += line.charAt(i);
                }
				else{
                    aux = aux.toLowerCase();
                    if (aux.length() > 0){
                        dictionary.add(aux);
                    }
                    aux = "";
                }
            }
            if (aux.length()> 0){
                aux = aux.toLowerCase();
                dictionary.add(aux);
            }
        }
		
        list.addAll(dictionary);
        Collections.sort(list);
		
        for (i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
