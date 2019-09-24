package by.epam.unit02.mas;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double[] a = new double[n];
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for(int i=0;i<n;i++){
            a[i] = in.nextDouble();
        }
        for(int i = 0;i<n;i++){
            if(a[i]>max)
                max=a[i];
            else if(a[i]<min)
                min=a[i];
        }
        double length = max - min;
        System.out.println(length);
    }
}
