package by.epam.unit02.mas;

import java.util.Random;
//we have two random cubes at the beginning and based
// on their values we insert the next ones.
public class Task18 {
    public static void main(String[] args) {
        int n = 10;
        Random rand = new Random();
        int a[] = new int[10];
        for(int i = 0;i<2;i++) {
            a[i] = rand.nextInt(6)+1;
        }
        for(int i = 0;i<n;i++)
        {
            if(a[0]+a[1]<10&&a[0]+a[1]>=4)
                a[2] = 10 - (a[0]+a[1]);
            else {
                if(a[1]%2==0){
                a[2] = (10 - a[1])/2;
                a[3] = (10 - a[1])/2;
                }
                else{
                    a[2] = (10 - a[1])/2;
                    a[3] = (10 - a[1])/2+1;
                }
            }
            System.out.println(a[i]);
        }
    }
}
