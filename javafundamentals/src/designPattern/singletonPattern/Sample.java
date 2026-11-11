package designPattern.singletonPattern;

public class Sample {

    private static Sample sample;

    private Sample(){

    }

    // Lazy initialization
    public static Sample getSample(){
        if(sample == null){
            sample = new Sample();
        }
        return sample;
    }
}
