package ResponseWatherData;

import lombok.Data;

@Data
public class ResponseWeather {

    private ResponseData data;

    private static final ResponseWeather instance = new ResponseWeather();

    //private constructor to avoid client applications to use constructor
    private ResponseWeather(){}

    public static ResponseWeather getInstance(){
        return instance;
    }
}
