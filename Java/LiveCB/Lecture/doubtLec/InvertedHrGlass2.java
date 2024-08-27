package Java.LiveCB.Lecture.doubtLec;

import java.util.Scanner;

public class InvertedHrGlass2 {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int n=sc.nextInt();
    int row=1;
    int nst=1;
    int nsp= 2*n-1;
    while(row<=2*n+1)
    {
        int i=1;
        while(i<=nst)
        {
            System.out.print("*"+"\t");
            i++;

        }
        int j=1;
        while(j<=nsp)
        {
            System.out.print(" "+"\t");
            j++;
        }
    
        int k=1;
        if(row==n+1){
            k=2;
        }
        while(k<=nst)
        {
            System.out.print("*"+"\t");
            k++;
        }

        if(row<n+1)
        {
            nst=nst+1;
            nsp=nsp-2;
        }
        else{
            nst=nst-1;
            nsp=nsp+2;
        }
        System.out.println();
        row=row+1;

    }
}

}
