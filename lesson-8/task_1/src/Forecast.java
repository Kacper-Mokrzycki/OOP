public interface Forecast {
    public int todaysTemperature();

    public class FakeForecast implements Forecast{
        @Override
        public int todaysTemperature() {
            return 15;
        }
    }
}