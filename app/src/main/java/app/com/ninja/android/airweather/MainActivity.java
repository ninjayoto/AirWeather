package app.com.ninja.android.airweather;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import app.com.ninja.android.airweather.api.GeoApi;
import app.com.ninja.android.airweather.api.GeoNames;
import app.com.ninja.android.airweather.api.WeatherObservation;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    TextView name;
    TextView temp;
    TextView cloud;
    TextView winDir;
    TextView windSpd;
    TextView humid;
    TextView press;
    EditText code;
    Button go;
    private String airportRequest;
    private String SAVED_AIRPORT = "saved airprort";
    String lastrequested;
    SharedPreferences myPrefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myPrefs = this.getSharedPreferences("myPrefs", MODE_WORLD_READABLE);
        lastrequested = myPrefs.getString(SAVED_AIRPORT, "none");


        name = (TextView) findViewById(R.id.name);
        temp = (TextView) findViewById(R.id.temp);
        cloud = (TextView) findViewById(R.id.cloud);
        winDir = (TextView) findViewById(R.id.windDir);
        windSpd = (TextView) findViewById(R.id.windSpd);
        humid = (TextView) findViewById(R.id.humid);
        press = (TextView) findViewById(R.id.press);
        code = (EditText) findViewById(R.id.code);
        go = (Button) findViewById(R.id.go);

//        if (lastrequested!="none") {
//
////              Display Last requested Data
//            airportRequest = lastrequested;
//            getdata();
//        }


        go.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (code!=null) {
                    airportRequest = code.getText().toString();

                    getdata();
                }
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (lastrequested!="none") {

//              Display Last requested Data
            airportRequest = lastrequested;
            getdata();
        }
    }

    public void getdata() {

        GeoApi.Factory.getInstance().displayWeather(airportRequest,"sdkteam").enqueue(new Callback<GeoNames>() {
            public String theCall = "";

            public void onResponse(Call<GeoNames> call,
                                   Response<GeoNames> response) {
                System.out.println(theCall);
                WeatherObservation data = response.body().getWeatherObservation();

            if (data!= null && airportRequest.matches("[a-zA-Z]+")) {
//              Display Data

                name.setText(data.getStationName());
                temp.setText(data.getTemperature() + " °C");
                cloud.setText(data.getClouds());
                winDir.setText("Wind Direction " + data.getWindDirection());
                windSpd.setText("Wind Speed " + data.getWindSpeed());
                press.setText(String.valueOf("Sea level Pressure " + data.getSeaLevelPressure()));
                humid.setText("Humidity " + data.getHumidity() + " %");


                SharedPreferences.Editor prefsEditor = myPrefs.edit();
                prefsEditor.putString(SAVED_AIRPORT, airportRequest);
                prefsEditor.commit();

                code.setText("");

            }else{
                Snackbar.make(name, "Can't find \"" + airportRequest + "\" Please enter a correct airport code", Snackbar.LENGTH_LONG).show();
            }


            }

            public void onFailure(Call<GeoNames> call, Throwable t) {
                Snackbar.make(name, "Can't get data try again later", Snackbar.LENGTH_LONG).show();

            }
        });
    }

}

