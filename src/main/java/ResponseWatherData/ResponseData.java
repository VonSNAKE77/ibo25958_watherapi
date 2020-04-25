package ResponseWatherData;

import lombok.Data;

import java.util.List;

@Data
public class ResponseData {
    private List<RequestData> request;
    private List<CurrentCondition> current_condition;
    private List<Wather> weather;
    private List<ClimateAverages> ClimateAverages;

    //Singielton
    private static final ResponseData instance = new ResponseData();

    private ResponseData(){}

    public static ResponseData getInstance(){
        return instance;
    }
}
