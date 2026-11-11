package designPattern.singletonPattern;

public class EgerSample {

    private final static EgerSample egerSample = new EgerSample();

    private  EgerSample(){}

    public static EgerSample getEgerSample(){
        return egerSample;
    }

}
