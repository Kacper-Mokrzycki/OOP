public class Euro implements Currency {
    protected float value;

    @Override
    public Currency addedCurrency(float value, String currency) {
        return new Euro(this.value + new FakeCantor().euroToRate(currency)*this.value);
    }



    @Override
    public Currency subtractedCurrency(float value, String currency) {
        return new Euro(this.value - new FakeCantor().euroToRate(currency)*this.value);
    }


    @Override
    public String abbreviation(String currency) {
        return new FakeCantor().rates(currency);
    }

    @Override
    public String symbol() {
        return this.symbol();
    }

    @Override
    public float balance() {
        return this.value;
    }

    @Override
    public float toDollarExchangeRate() {
        return 0;
    }

    public Euro(float balance)
    {
        this.balance();
    }

    // TODO: implement class
}
