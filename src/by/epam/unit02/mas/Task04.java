package by.epam.unit02.mas;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double[] a = new double[n];
        for(int i = 0;i<n;i++){
            a[i] = in.nextInt();
        }

        for(int i = 1;i<n;)
        {
            if(a[i]>a[i-1])
                i++;
            else{
                System.out.println("not increasing");
                return;
            }
            System.out.println("increasing");
        }
    }
}
