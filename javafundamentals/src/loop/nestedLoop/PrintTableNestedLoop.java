package loop.nestedLoop;

import java.util.Scanner;

public class PrintTableNestedLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to print table of : ");
        int num = scanner.nextInt();
        for(int i = num; i<= num; i++){
            for(int j = 1; j<=10; j++){
                System.out.println(i +"*" +j+"=" + (i*j));
            }
        }
    }
}
