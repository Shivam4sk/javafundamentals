package mcq;

public class Test8 {

    public static void main(String[] args) {
        int num = 0;

        while (num <= 10) {
            num++;
            if (num % 2 == 0) {
                continue;
            }
            System.out.println(num + " ");
        }
    }
}