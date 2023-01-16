public class Main {
    public static void main(String[] args) {
        Sequence characters = new Characters("Hello World!");
        System.out.println(characters.printSeq());

        Sequence lowerCases = new LowerCases(characters);
        System.out.println(lowerCases.printSeq());

        Sequence substring = new Substring(characters, 0, 5);
        System.out.println(substring.printSeq());

        Sequence concatenation = new Concatenation(characters, substring);
        System.out.println(concatenation.printSeq());


    }
}

interface Sequence {
    String printSeq();
}

class Characters implements Sequence {
    private String str;

    public Characters(String str) {
        this.str = str;
    }

    @Override
    public String printSeq() {
        return str;
    }
}

class LowerCases implements Sequence {
    private Sequence sequence;

    public LowerCases(Sequence sequence) {
        this.sequence = sequence;
    }

    @Override
    public String printSeq() {
        return sequence.printSeq().toLowerCase();
    }
}

class Substring implements Sequence {
    private Sequence sequence;
    private int start, end;

    public Substring(Sequence sequence, int start, int end) {
        this.sequence = sequence;
        this.start = start;
        this.end = end;
    }

    @Override
    public String printSeq() {
        return sequence.printSeq().substring(start, end);
    }
}

class Concatenation implements Sequence {
    private Sequence sequence1, sequence2;

    public Concatenation(Sequence sequence1, Sequence sequence2) {
        this.sequence1 = sequence1;
        this.sequence2 = sequence2;
    }

    @Override
    public String printSeq() {
        return sequence1.printSeq() + sequence2.printSeq();
    }
}
