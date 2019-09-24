package by.epam.unit02.mas;

import java.util.Random;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        double a[] = new double[size];
        double minValue;
        double maxValue;
        double tmp;
        int minPos = 0;
        int maxPos = 0;
        Random rand = new Random();

        for(int i=0;i<size;i++){
            a[i] = rand.nextGaussian()*1000;
        }
        minValue = maxValue = a[0];

        for(int i=0;i<a.length;i++)
        {
            if(minValue>a[i]){
                minValue = a[i];
                minPos = i;
            }
            if(maxValue<a[i]){
                maxValue = a[i];
                maxPos = i;
            }
        }

        for(int i = 0;i<a.length;i++) {
            System.out.println(a[i]);
        }
        tmp = a[minPos];
        a[minPos] = a[maxPos];
        a[maxPos] = tmp;

        for(int i = 0;i<a.length;i++) {
            System.out.println(a[i]);
        }
    }
}
