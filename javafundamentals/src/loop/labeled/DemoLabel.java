package loop.labeled;

public class DemoLabel {

    public static void main(String[] args) {

        labelOuter:
        for(int i = 1; i<= 7;i++){
            for(int j = 1; j<=7; j++){
                if(j == 5){
                    break labelOuter;
                }
                System.out.println(i +" "+ j);
            }
        }
    }
}
