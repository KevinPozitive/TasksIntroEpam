package by.epam.unit02.mas;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];

        for(int i = 0;i<n;i++){
            a[i] = in.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]>0)
                System.out.println("positive");
            else if (a[i]<0)
                System.out.println("Negative");
            else
                i++;
        }
    }
}
