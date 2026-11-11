package designPattern.singletonPattern;

public class SingletonMain {

    public static void main(String[] args){
        Sample sample1 = Sample.getSample();
        Sample sample2 = Sample.getSample();

        System.out.println(sample1.hashCode());
        System.out.println(sample2.hashCode());


        System.out.println(EgerSample.getEgerSample().hashCode());
        System.out.println(EgerSample.getEgerSample().hashCode());
    }
}
