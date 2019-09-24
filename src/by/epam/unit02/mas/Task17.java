package by.epam.unit02.mas;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            a[i] = in.nextInt();
            if(a[i]<min)
                min = a[i];
        }
        for(int i = 0;i < a.length;i++)
        {
            if(a[i]==min){
                for(int j = i;j<a.length - 1;j++){
                    a[j]=a[j+1];
                }
                n--;
            }
        }
        int tmp[] = new int[n];
        for(int i = 0;i<n;i++) {
            tmp[i] = a[i];
        }
        a = new int[n];
        for(int i = 0;i<n;i++)
        {
            a[i] = tmp[i];
            System.out.println(a[i]);
        }
        System.out.println(a.length);
        //I've a question about this task
        //The question is memory reallocation
        //And I know, that this algorithm has a problem or a flaw
        //I think it's doesn't matter
    }
}
