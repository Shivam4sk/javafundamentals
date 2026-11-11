package loop.forLoop;

import java.util.Scanner;

public class AverageOfNaturalNumberForLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        int avg = 0;
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum +=i;
            avg = sum/n;
        }
        System.out.println("Average of " +n + "numbers is: "+avg );
    }
}
