import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {

        int num ;
        Scanner obj=new Scanner(System.in);
        int num =obj .nextInt();
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
