package by.epam.unit02.mas;

import java.util.Random;
import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Z = in.nextInt();
        int quantity = 0;
        double a[];
        Random rand = new Random();
        int n = in.nextInt();
        a = new double[n];
        for(int i=0;i<n;i++){
            a[i] = rand.nextDouble()*1000;
            System.out.println(a[i]);
        }
        for(int i = 0;i<n;i++) {
            if(a[i]>Z) {
                a[i] = Z;
                quantity++;
            }
        }
        for(int i = 0;i<n;i++) {
            System.out.println(a[i]);
        }
        System.out.println(quantity);
    }
}
