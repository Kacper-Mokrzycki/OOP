public class Weather {
    private Forecast forecast;

    public Weather(Forecast forecast) {
        this.forecast = forecast;
    }

    public int todaysTemperature() {
        return forecast.todaysTemperature();
    }
}