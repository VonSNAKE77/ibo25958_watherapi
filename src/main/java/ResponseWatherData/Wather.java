package ResponseWatherData;

import lombok.Data;

import java.util.List;


@Data
public class Wather {

    private String date;
    private List<WatherAstronomy> astronomy;
    private Integer maxtempC;
    private Integer maxtempF;
    private Integer mintempC;
    private Integer mintempF;
    private Integer avgtempC;
    private Integer avgtempF;
    private Float totalSnow_cm;
    private Float sunHour;
    private Integer uvIndex;
    private List<WatherHourly> hourly;






    //Singielton
    private static final Wather instance = new Wather();

    private Wather(){}

    public static Wather getInstance(){
        return instance;
    }
}
