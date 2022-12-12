public class Main {
    public static void main(String[] args)
    {
        Forecast forecast = new Forecast.FakeForecast();
        Weather weather = new Weather(forecast);
        int temp = weather.todaysTemperature();
        System.out.println(temp);
    }
}