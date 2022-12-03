package ex_2;

interface Number{
    double doubleValue();
}

public class Logarithm implements Number {
    private final double base;
    private double argument;

    private void checkBase(double base){
        if (this.base <= 0){
            throw new IllegalArgumentException("Base cannot be <= 0");
        } if (this.base == 1) {
            throw new IllegalArgumentException("Base cannot be = 1");
        }
    }

    private void checkArgument(double argument){
        if (this.argument < 1){
            throw new IllegalArgumentException("Argument cannot be < 1");

        }
    }
    @Override
    public double doubleValue()
    {
        checkBase(this.base);
        checkArgument(this.argument);

            return Math.log(this.argument) / Math.log(this.base);


    }

    public Logarithm(double inputBase, double inputArgument)
    {
        this.base = inputBase;
        this.argument = inputArgument;
    }
}