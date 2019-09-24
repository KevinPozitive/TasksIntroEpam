package by.epam.unit02.mas;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int k = in.nextInt();
        int sum = 0;
        for(int i = 0;i<n;i++)
        {
            if(a[i]%k==0)
            {
                sum = sum+a[i];
            }
        }
        System.out.println(sum);
    }
}
