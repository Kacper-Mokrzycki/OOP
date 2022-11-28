public class Numberutils {

    private int a;
    private int b;

    public int max()
    {
        return this.a > this.b ? this.a: this.b;
    }

    public int min()
    {
        return this.a < this.b ? this.a: this.b;
    }

    public float avg()
    {
        return (this.a + this.b) / 2;
    }

    public Numberutils(int a, int b) {
        this.a = a;
        this.b = b;
    }

}
