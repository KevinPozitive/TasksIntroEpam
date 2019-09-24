package by.epam.unit02.mas;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[]a = new int[n];
        int size = 0;

        for(int i = 0;i<a.length;i++){
            a[i] = in.nextInt();
        }

        for(int i = 0;i<n;i++)
        {
            if(a[i]==0){
                size++;
            }
        }
        int[]b = new int[size];

        for(int i=0;i<n;i++)
        {
            int j=0;
            if(a[i]==0){
                b[j]=i;
                j++;
            }
        }
    }
}
