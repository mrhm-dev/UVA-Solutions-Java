
/*
* Oj Name : UVA
* Problem No : 136
* Problem Name :  - Ugly Numbers
* Time Limit : 3.00 Seconds
* RunTime : 0.030
*/

public class Main {

    public static void main(String[] args)
    {
        int arr[] = new int[1500];
        arr[0] = 1;
        int pos2 = 0;
        int pos3 = 0;
        int pos5 = 0;
        int ug2, ug3, ug5, i, prev;

        for(i = 1; i < 1500; i++)
        {
            prev = arr[i-1];

            while(arr[pos2] * 2 <= prev)
                pos2++;
            while(arr[pos3] * 3 <= prev)
                pos3++;
            while(arr[pos5] * 5 <= prev)
                pos5++;

            ug2 = arr[pos2] * 2;
            ug3 = arr[pos3] * 3;
            ug5 = arr[pos5] * 5;
			
            arr[i] = Math.min(Math.min(ug2, ug3), ug5);
        }

        System.out.println("The 1500'th ugly number is " + arr[1499] + ".");
    }
}
