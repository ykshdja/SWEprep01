package Java.LiveCB.Lecture.doubtLec;

import java.util.Scanner;

public class InvertedHrGlass {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int row=1;
    int rowval=1;
    int nsp=n-1;
    int nst=1;
    while (row<=n)
    {
        int i=1;
        //print spaces 
        while(i<=nsp)
        {
            System.out.print(" "+"\t");
            i=i+1;

        }
        //print stars
        int j=1;
        int colval= rowval;
    
        while(j<=nst)
        {
            System.out.print(colval+"\t");
            if(j<(nst+1)/2)
            {
                colval=colval+1;

            }
            else{
                colval = colval-1;
            }
            j++;
            

        }
        nsp=nsp-1;
        nst=nst+2;
        rowval++;
        
        System.out.println();
         row=row+1;
        
    }
  

    

    sc.close();
}
}
