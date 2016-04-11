package app.com.ninja.android.airweather.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GeoNames {

    @SerializedName("weatherObservation")
    @Expose
    private WeatherObservation weatherObservation;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GeoNames() {
    }

    /**
     * 
     * @param weatherObservation
     */
    public GeoNames(WeatherObservation weatherObservation) {
        this.weatherObservation = weatherObservation;
    }

    /**
     * 
     * @return
     *     The weatherObservation
     */
    public WeatherObservation getWeatherObservation() {
        return weatherObservation;
    }

    /**
     * 
     * @param weatherObservation
     *     The weatherObservation
     */
    public void setWeatherObservation(WeatherObservation weatherObservation) {
        this.weatherObservation = weatherObservation;
    }

}
