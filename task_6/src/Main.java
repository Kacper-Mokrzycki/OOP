public class Main {
    public static void main(String[] args) {
        Numberutils firstPair = new Numberutils(2, 3);

        System.out.println(String.format("Here is result of max() function of firstPair %d",  firstPair.max()));
        System.out.println(String.format("Here is result of min() function of firstPair %d",  firstPair.min()));
        System.out.println(String.format("Here is result of avg() function of firstPair %f",  firstPair.avg()));
    }


}