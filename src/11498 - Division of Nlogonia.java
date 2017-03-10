/*
* Oj Name : UVA
* Problem No : 11498
* Problem Name :  - Division of Nlogonia
* Time Limit : 3.00 Seconds
* RunTime : 0.140
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n, px, py, x, y;

        n = sc.nextInt();

        while (n!=0){
			
            px = sc.nextInt();
            py = sc.nextInt();

            while (n-- > 0){
				
                x = sc.nextInt();
                y = sc.nextInt();

                if (x == px || y == py)
                    System.out.println("divisa");
                else if (x < px && y > py)
                    System.out.println("NO");
                else if (x > px && y > py)
                    System.out.println("NE");
                else if (x > px && y < py)
                    System.out.println("SE");
                else if (x < px && y < py)
                    System.out.println("SO");
            }

            n = sc.nextInt();
        }
    }
}
