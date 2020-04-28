package ResponseWatherData;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class WatherAstronomy {

    private String sunrise;
    private String sunset;
    private String moonrise;
    private String moonset;
    private String  moon_phase;
    private String moon_illumination;

    //Singielton
    private static final WatherAstronomy instance = new WatherAstronomy();

    private WatherAstronomy(){}

    public static WatherAstronomy getInstance(){
        return instance;
    }
}
