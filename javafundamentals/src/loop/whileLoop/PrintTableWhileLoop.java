package loop.whileLoop;

import java.util.Scanner;

public class PrintTableWhileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();

        int i = 1;
        while (i<=10){
            int mul = num * i;

            System.out.println(num + "*" + i + " = "+ mul);
            i++;
        }
    }
}
