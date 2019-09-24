package by.epam.unit02.mas;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int size = 0;
        for(int i = 0;i<n;i++){
            a[i] = in.nextInt();
        }

        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                size++;
            }
        }
        int[]b=new int[size];
        for(int i=0;i<n;i++)
        {
            int j=0;
            if(size == 0){
                System.out.println("no even numbers");
                return;
            }else {
                if(a[i]%2==0){
                    b[j]=a[i];
                    j++;
                }
            }
        }
    }
}
