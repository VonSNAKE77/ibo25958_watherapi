package ResponseWatherData;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.util.List;

@Data
@Root(name = "data")
public class ResponseData {
    @Element(name = "request")
    private RequestData requestXml;
    private List<RequestData> request;
    private List<CurrentCondition> current_condition;
    private List<Weather> weather;
    private List<ClimateAverages> ClimateAverages;

    //Singielton
    private static final ResponseData instance = new ResponseData();

    private ResponseData(){}

    public static ResponseData getInstance(){
        return instance;
    }
}
