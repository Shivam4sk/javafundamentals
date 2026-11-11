package loop.forLoop;

import java.util.Scanner;

public class PrintTableForLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();

        for(int i=1; i<=10; i++){
            int mul = num*i;
            System.out.println(num + "*" +i+ " = "+ mul);
        }
    }
}
