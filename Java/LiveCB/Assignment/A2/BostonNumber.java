package Java.LiveCB.Assignment.A2;
import java.util.Scanner;

public class BostonNumber {
    // Constraint - Input (Int's Maximum value )
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        System.out.println(BostonNumber(n));
        Sc.close();    
    }

    public static int BostonNumber(int n)
    {
        int BstnNum = 0;
        int digit = sumOfDigit(n);
        int pf=0;
        int div=2;
        while(div<=n)
        {
            int rem = n%div;
            if(rem==0){
                pf=pf+sumOfDigit(div);
                n=n/div;
            }
            else{
                div++;
            }
            if(pf==digit)
            {
                BstnNum = 1;
            }
            else{
                BstnNum = 0;
            }

        }
        return BstnNum; 
        
    }
    public static int sumOfDigit(int num)
    { // Sum of a Digit - Add the remainder(modulo) of the number until the number becomes ZERO.
        int sum =0;
        while(num!=0)
        {
            int rem = num%10;
            sum+=rem;
            num/=10;
        }
        return sum;
    }
    
}
