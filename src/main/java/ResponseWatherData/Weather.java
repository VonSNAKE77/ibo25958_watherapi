package ResponseWatherData;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Weather {

    private String date;
    private List<WeatherAstronomy> astronomy;
    private Integer maxtempC;
    private Integer maxtempF;
    private Integer mintempC;
    private Integer mintempF;
    private Integer avgtempC;
    private Integer avgtempF;
    private Float totalSnow_cm;
    private Float sunHour;
    private Integer uvIndex;
    private List<WeatherHourly> hourly;

}
