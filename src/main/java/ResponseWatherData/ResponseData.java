package ResponseWatherData;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.util.List;

@Data
@Root(name = "data")
public class ResponseData {
    @Element(name = "request")
    private ResponseData requestXml;
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
