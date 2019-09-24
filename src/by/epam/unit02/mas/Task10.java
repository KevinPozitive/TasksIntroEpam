package by.epam.unit02.mas;


import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        double a[]=new double[size];

        for(int i = 0;i<a.length;i++)
        {
            a[i] = in.nextDouble();
        }
        for(int i = 0;i<a.length;i++) {
            if(a[i]>i)
            {
                System.out.println(a[i]);
            }
        }
    }
}
