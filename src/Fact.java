import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long final_output = Factorial(num);
        System.out.println(" Factorial is : " +final_output);
    }
    public static long Factorial(long num){
        if (num>1)
            return num* Factorial(num-1);

        else
            return 1;
    }
}
