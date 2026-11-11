package loop.forLoop;

import java.util.Scanner;

public class SumOfNNaturalNumberUsingFor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int n = scanner.nextInt();
        int sum = 0;

        // 1+2+3+4+5=15

        for(int i = 1; i <= n;i++ ){
            sum += i;
        }
        System.out.println("sum is: "+sum);
    }
}
