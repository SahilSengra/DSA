import java.util.Scanner;

public class Power_nikalna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base Value : ");
        long B = sc.nextLong();
        System.out.println("Enter the Power Value : ");
        long P = sc.nextLong();
        long final_output = Power(B,P);
        System.out.println("the Answer is : " +final_output);
    }
    public static long Power(long x,long n){
        if (n!= 0)
        return x* Power(x,n-1);
        else
            return 1;
    }

}
