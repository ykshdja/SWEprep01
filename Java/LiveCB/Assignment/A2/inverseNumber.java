package Java.LiveCB.Assignment.A2;
import java.util.Scanner;
public class inverseNumber {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        System.out.println(Inverse(n));
        Sc.close();

    }

    public static int Inverse(int n)
    {
        int sum = 0;
        int index = 1;
        while(n!=0)
        {
            int rem = n%10;
            sum = (int) (sum + index * Math.pow(10, rem-1));
            n=n/10;
            index++;
        }            
        return sum;
    }
}
