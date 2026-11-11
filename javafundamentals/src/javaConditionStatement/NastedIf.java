package javaConditionStatement;

public class NastedIf {
    public static void main(String[] args) {
        int age = 10;
        boolean hasVoterId = true;
        if(age >= 19) {
            if (hasVoterId){
                System.out.println("can vote");
            }
        }else {
            System.out.println("can't vote");
        }
    }
}
