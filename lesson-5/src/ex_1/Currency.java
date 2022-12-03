package ex_1;

public interface Currency {
  Currency addedCurrency(float value, String currency);
  Currency subtractedCurrency(float value, String currency);
  String abbreviation();
  String symbol();
  float balance();
  float toDollarExchangeRate();
}
