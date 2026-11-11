package loop.doWhile;

import java.util.Scanner;

public class PrintTableDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = scanner.nextInt();

        int i =1;

        do{
            int mul = num*i;
            System.out.println(num + "*" + i + " = "+ mul);
            i++;
        }while (i <= 10);
    }
}
