package ResponseWatherData;

public class Wather {




    //Singielton
    private static final Wather instance = new Wather();

    private Wather(){}

    public static Wather getInstance(){
        return instance;
    }
}
