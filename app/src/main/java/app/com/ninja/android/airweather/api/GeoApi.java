package app.com.ninja.android.airweather.api;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface GeoApi {
	

	String BASE_URL = "http://api.geonames.org/"; 

	//retrofit interface (GET)
	@GET("weatherIcaoJSON")
	public Call<GeoNames> displayWeather(@Query("ICAO") String icao, @Query("username") String userName);

	class Factory{

		private static GeoApi service;
		

		public static GeoApi getInstance(){
			// a method to instantiate an instance of service if not instantiated

			if (service == null){
				//building the API into an object
				Retrofit retrofit = new Retrofit.Builder()

				.addConverterFactory(GsonConverterFactory.create())
				.baseUrl(BASE_URL)
				.build();
				service = retrofit.create(GeoApi.class);
				return service;
			}else {
				return service;
			}
		}
	}

}
