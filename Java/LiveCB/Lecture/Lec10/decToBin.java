package Java.LiveCB.Lecture.Lec10;

public class decToBin {
    public static void main(String[] args) {
        int n=43;
        int ans=0;
        int mul=1;
        while(n!=0)
        {
            int rem=n%2;
            ans=ans+rem*mul;
            mul*=10;
            n/=2;
        }

        System.out.println(ans);

    }
}
