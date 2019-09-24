package by.epam.unit02.mas;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[]a = new int[n];
        for(int i = 0;i<n;i++){
            a[i]=in.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MAX_VALUE;
        int iter_1 = 2;
        int iter_2 = 1;
        while (n>iter_1){
            if(max<a[iter_1])
            {
                max = a[iter_1];
            }
            iter_1 = iter_1*2;
        }
        while(n>iter_2){
            if(min<a[iter_2]){
                min = a[iter_2];
            }
            iter_2 = iter_2*2+1;
        }
        int sum = max+min;
    }
}
