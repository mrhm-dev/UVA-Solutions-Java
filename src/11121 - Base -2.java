/*
* Oj Name : UVA
* Problem No : 11121 
* Problem Name : Base -2
* Time Limit : 3.00 Seconds
* RunTime : 0.100
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        StringBuffer sb = new StringBuffer("");
		
        int cases=Integer.parseInt(br.readLine());
		
        for(int i=1;i<cases+1;i++) {
			
            int x=Integer.parseInt(br.readLine());
            sb.append("Case #").append(i).append(": ").append(binary(x)).append("\n");
        }
		
        System.out.print(sb);
    }

    static String binary(long n) {
		
        StringBuilder temp=new StringBuilder();
		
        while(true){
            if(n==0){
                temp.append("0");
                break;
            }
            if(n==1){
                temp.append("1");
                break;
            }
            if(n==-1){
                temp.append("11");
                break;
            }
            if(n%2==0){
                n/=-2;
                temp.append("0");
            }else{
                n--;
                n/=-2;
                temp.append("1");
            }
        }
		
        return temp.reverse().toString();
    }
}
