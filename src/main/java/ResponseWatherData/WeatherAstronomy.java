package ResponseWatherData;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class WeatherAstronomy {

    private String sunrise;
    private String sunset;
    private String moonrise;
    private String moonset;
    private String moon_phase;
    private String moon_illumination;

    //Singielton
    private static final WeatherAstronomy instance = new WeatherAstronomy();

    private WeatherAstronomy(){}

    public static WeatherAstronomy getInstance(){
        return instance;
    }
}
