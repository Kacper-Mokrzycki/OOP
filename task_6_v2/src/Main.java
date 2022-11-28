public class Main {

    public static void main(String[] args) {
        try {
            Logarithm log1 = new Logarithm(-1, 0);
            System.out.println(log1.doubleValue());
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}

