package javaConditionStatement;

public class FindLargestIntoThreeNumber {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 3;

        if(a > b){
            if(a > c){
                System.out.println("Largest number is a: "+a);
            }else {
                System.out.println("Largest number is c: "+c);
            }
        }else if(b > c){
            System.out.println("Largest number is b: "+b);
        }else {
            System.out.println("Largest number is c: "+c);
        }
    }
}
