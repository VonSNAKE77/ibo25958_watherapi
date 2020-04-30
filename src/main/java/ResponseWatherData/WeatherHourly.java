package ResponseWatherData;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class WeatherHourly {

    private String time;
    private Integer tempC;
    private Integer tempF;
    private Integer windspeedMiles;
    private Integer windspeedKmph;
    private Integer winddirDegree;
    private String winddir16Point;
    private Integer weatherCode;
    private List<WeatherIconUrl> weatherIconUrl;
    private List<WeatherDesc> weatherDesc;
    private Float precipMM;
    private Float precipInches;
    private Float humidity;
    private Integer visibility;
    private Integer visibilityMiles;
    private Integer pressure;
    private Float pressureInches;
    private Integer cloudcover;
    private Integer HeatIndexC;
    private Integer HeatIndexF;
    private Integer DewPointC;
    private Integer DewPointF;
    private Integer WindChillC;
    private Integer WindChillF;
    private Integer WindGustMiles;
    private Integer WindGustKmph;
    private Integer FeelsLikeC;
    private Integer FeelsLikeF;
    private Integer chanceofrain;
    private Integer chanceofremdry;
    private Integer chanceofwindy;
    private Integer chanceofovercast;
    private Integer chanceofsunshine;
    private Integer chanceoffrost;
    private Integer chanceofhightemp;
    private Integer chanceoffog;
    private Integer chanceofsnow;
    private Integer chanceofthunder;
    private Integer uvIndex;



}
