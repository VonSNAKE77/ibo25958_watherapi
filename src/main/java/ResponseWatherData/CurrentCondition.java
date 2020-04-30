package ResponseWatherData;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class CurrentCondition {
    private String observation_time;
    private Integer temp_C;
    private Integer temp_F;
    private Integer weatherCode;
    private Integer windspeedMiles;
    private Integer windspeedKmph;
    private Integer winddirDegree;
    private String winddir16Point;
    private Float precipMM;
    private Float precipInches;
    private Float humidity;
    private Integer visibility;
    private Integer visibilityMiles;
    private Integer pressure;
    private Float pressureInches;
    private Integer cloudcover;
    private Integer FeelsLikeC;
    private Integer FeelsLikeF;
    private Integer uvIndex;
    private List<WeatherIconUrl> weatherIconUrl;
    private List<WeatherDesc> weatherDesc;


    //Singielton
    private static final CurrentCondition instance = new CurrentCondition();

    private CurrentCondition(){}

    public static CurrentCondition getInstance(){
        return instance;
    }

}
