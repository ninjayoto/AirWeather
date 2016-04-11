
package app.com.ninja.android.airweather.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WeatherObservation {

    @SerializedName("weatherCondition")
    @Expose
    private String weatherCondition;
    @SerializedName("clouds")
    @Expose
    private String clouds;
    @SerializedName("observation")
    @Expose
    private String observation;
    @SerializedName("windDirection")
    @Expose
    private Integer windDirection;
    @SerializedName("ICAO")
    @Expose
    private String ICAO;
    @SerializedName("seaLevelPressure")
    @Expose
    private Double seaLevelPressure;
    @SerializedName("elevation")
    @Expose
    private Integer elevation;
    @SerializedName("countryCode")
    @Expose
    private String countryCode;
    @SerializedName("cloudsCode")
    @Expose
    private String cloudsCode;
    @SerializedName("lng")
    @Expose
    private Double lng;
    @SerializedName("temperature")
    @Expose
    private String temperature;
    @SerializedName("dewPoint")
    @Expose
    private String dewPoint;
    @SerializedName("windSpeed")
    @Expose
    private String windSpeed;
    @SerializedName("humidity")
    @Expose
    private Integer humidity;
    @SerializedName("stationName")
    @Expose
    private String stationName;
    @SerializedName("datetime")
    @Expose
    private String datetime;
    @SerializedName("lat")
    @Expose
    private Double lat;

    /**
     * No args constructor for use in serialization
     * 
     */
    public WeatherObservation() {
    }

    /**
     * 
     * @param weatherCondition
     * @param clouds
     * @param observation
     * @param windDirection
     * @param ICAO
     * @param seaLevelPressure
     * @param elevation
     * @param countryCode
     * @param cloudsCode
     * @param lng
     * @param temperature
     * @param dewPoint
     * @param windSpeed
     * @param humidity
     * @param datetime
     * @param stationName
     * @param lat
     */
    public WeatherObservation(String weatherCondition, String clouds, String observation, Integer windDirection, String ICAO, Double seaLevelPressure, Integer elevation, String countryCode, String cloudsCode, Double lng, String temperature, String dewPoint, String windSpeed, Integer humidity, String stationName, String datetime, Double lat) {
        this.weatherCondition = weatherCondition;
        this.clouds = clouds;
        this.observation = observation;
        this.windDirection = windDirection;
        this.ICAO = ICAO;
        this.seaLevelPressure = seaLevelPressure;
        this.elevation = elevation;
        this.countryCode = countryCode;
        this.cloudsCode = cloudsCode;
        this.lng = lng;
        this.temperature = temperature;
        this.dewPoint = dewPoint;
        this.windSpeed = windSpeed;
        this.humidity = humidity;
        this.stationName = stationName;
        this.datetime = datetime;
        this.lat = lat;
    }

    /**
     * 
     * @return
     *     The weatherCondition
     */
    public String getWeatherCondition() {
        return weatherCondition;
    }

    /**
     * 
     * @param weatherCondition
     *     The weatherCondition
     */
    public void setWeatherCondition(String weatherCondition) {
        this.weatherCondition = weatherCondition;
    }

    /**
     * 
     * @return
     *     The clouds
     */
    public String getClouds() {
        return clouds;
    }

    /**
     * 
     * @param clouds
     *     The clouds
     */
    public void setClouds(String clouds) {
        this.clouds = clouds;
    }

    /**
     * 
     * @return
     *     The observation
     */
    public String getObservation() {
        return observation;
    }

    /**
     * 
     * @param observation
     *     The observation
     */
    public void setObservation(String observation) {
        this.observation = observation;
    }

    /**
     * 
     * @return
     *     The windDirection
     */
    public Integer getWindDirection() {
        return windDirection;
    }

    /**
     * 
     * @param windDirection
     *     The windDirection
     */
    public void setWindDirection(Integer windDirection) {
        this.windDirection = windDirection;
    }

    /**
     * 
     * @return
     *     The ICAO
     */
    public String getICAO() {
        return ICAO;
    }

    /**
     * 
     * @param ICAO
     *     The ICAO
     */
    public void setICAO(String ICAO) {
        this.ICAO = ICAO;
    }

    /**
     * 
     * @return
     *     The seaLevelPressure
     */
    public Double getSeaLevelPressure() {
        return seaLevelPressure;
    }

    /**
     * 
     * @param seaLevelPressure
     *     The seaLevelPressure
     */
    public void setSeaLevelPressure(Double seaLevelPressure) {
        this.seaLevelPressure = seaLevelPressure;
    }

    /**
     * 
     * @return
     *     The elevation
     */
    public Integer getElevation() {
        return elevation;
    }

    /**
     * 
     * @param elevation
     *     The elevation
     */
    public void setElevation(Integer elevation) {
        this.elevation = elevation;
    }

    /**
     * 
     * @return
     *     The countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 
     * @param countryCode
     *     The countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * 
     * @return
     *     The cloudsCode
     */
    public String getCloudsCode() {
        return cloudsCode;
    }

    /**
     * 
     * @param cloudsCode
     *     The cloudsCode
     */
    public void setCloudsCode(String cloudsCode) {
        this.cloudsCode = cloudsCode;
    }

    /**
     * 
     * @return
     *     The lng
     */
    public Double getLng() {
        return lng;
    }

    /**
     * 
     * @param lng
     *     The lng
     */
    public void setLng(Double lng) {
        this.lng = lng;
    }

    /**
     * 
     * @return
     *     The temperature
     */
    public String getTemperature() {
        return temperature;
    }

    /**
     * 
     * @param temperature
     *     The temperature
     */
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    /**
     * 
     * @return
     *     The dewPoint
     */
    public String getDewPoint() {
        return dewPoint;
    }

    /**
     * 
     * @param dewPoint
     *     The dewPoint
     */
    public void setDewPoint(String dewPoint) {
        this.dewPoint = dewPoint;
    }

    /**
     * 
     * @return
     *     The windSpeed
     */
    public String getWindSpeed() {
        return windSpeed;
    }

    /**
     * 
     * @param windSpeed
     *     The windSpeed
     */
    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    /**
     * 
     * @return
     *     The humidity
     */
    public Integer getHumidity() {
        return humidity;
    }

    /**
     * 
     * @param humidity
     *     The humidity
     */
    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    /**
     * 
     * @return
     *     The stationName
     */
    public String getStationName() {
        return stationName;
    }

    /**
     * 
     * @param stationName
     *     The stationName
     */
    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    /**
     * 
     * @return
     *     The datetime
     */
    public String getDatetime() {
        return datetime;
    }

    /**
     * 
     * @param datetime
     *     The datetime
     */
    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    /**
     * 
     * @return
     *     The lat
     */
    public Double getLat() {
        return lat;
    }

    /**
     * 
     * @param lat
     *     The lat
     */
    public void setLat(Double lat) {
        this.lat = lat;
    }

}
