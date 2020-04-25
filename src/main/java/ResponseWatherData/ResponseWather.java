package ResponseWatherData;

import lombok.Data;

@Data
public class ResponseWather {
    private ResponseData data;

    private static final ResponseWather instance = new ResponseWather();

    //private constructor to avoid client applications to use constructor
    private ResponseWather(){}

    public static ResponseWather getInstance(){
        return instance;
    }
}
