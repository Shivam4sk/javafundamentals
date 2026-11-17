package arrays;

public class ProblemsOnArray {

    public static void main(String[] args) {

        //sum of all element of an array
//        int[] numbers = {1,2,3,4,5,6};
//        int sum = 0;
//        for(int i:numbers){
//            sum += i;
//        }
//        System.out.println("Sum is :"+sum);

        //Multiple all all element of an array:
        int[] numbers = {1,2,3,4,5,6};
        int multi = 1;
        for(int num:numbers){
            multi *= num;
        }
        System.out.println("Multiple all all element of an array: "+multi);
    }
}
