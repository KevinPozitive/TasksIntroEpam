package by.epam.unit02.mas;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int M = in.nextInt();
        int L;
        for(int i = 0;i<n;i++)
        {
            a[i]=in.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            L=a[i]%M;
            if(0<L&&L<M-1)
            {
                System.out.println(a[i]);
            }
        }
    }
}
