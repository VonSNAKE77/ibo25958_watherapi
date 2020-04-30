import ResponseWatherData.ResponseWeather;
import com.google.gson.Gson;
import lombok.SneakyThrows;
import lombok.extern.java.Log;
import okhttp3.*;
import org.jetbrains.annotations.NotNull;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.IOException;

@Log
public class Main {
    private static Gson gson = new Gson();

    public static void main(String[] vararg) {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://api.worldweatheronline.com/premium/v1/weather.ashx?key=8f0bb0a2ae834bfc8c6103952200904&q=48.85,2.35&num_of_days=2&tp=3&format=json")
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                log.warning(e.toString());
            }

            @SneakyThrows
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                String resp = response.body().string();
              //  log.info(resp);
                ResponseWeather customObject = gson.fromJson(resp, ResponseWeather.class);

                Serializer serializer = new Persister();

                // ResponseData customObject = serializer.read(ResponseData.class, resp);
                log.info(customObject.toString());


            }
        });
    }
}
