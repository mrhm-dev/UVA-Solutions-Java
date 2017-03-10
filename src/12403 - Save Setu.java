
/*
* Oj Name : UVA
* Problem No : 12403
* Problem Name :  - Save Setu
* Time Limit : 1.00 Seconds
* RunTime : 0.030
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args)throws IOException{
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb=new StringBuffer();
		
        int cases = Integer.parseInt(br.readLine());
		
        int report=0;
		
        for (int i = 0; i < cases; i++) {
			
            String temp=br.readLine();
            if(temp.equals("report")){
                sb.append(report).append("\n");
            }else{
                String[]str=temp.split(" ");
                int plus=Integer.parseInt(str[1]);
                report+=plus;
            }
        }
        System.out.print(sb);
    }
}
