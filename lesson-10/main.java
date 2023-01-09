import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Main {
    public static void main(String[] args) {
        Shiritori my_shiritori = new Shiritori();
        my_shiritori.play("apple");
        my_shiritori.play("ear");
        my_shiritori.play("rhino");
        my_shiritori.play("corn");
        System.out.println(my_shiritori.printWords());
        my_shiritori.restart();
        System.out.println(my_shiritori.printWords());
        my_shiritori.play("hostess");
        my_shiritori.play("stash");
        my_shiritori.play("hostess");
        System.out.println(my_shiritori.printWords());
        my_shiritori.restart();
        my_shiritori.play("green");
        my_shiritori.play("nick");
        my_shiritori.play("hostess");
        System.out.println(my_shiritori.printWords());
        my_shiritori.restart();
    }
}

final class Shiritori implements ShiritoriMethods{
    private List<String> words = new ArrayList<>();

    public boolean game_over = false;

    public Shiritori()
    {
        words = new ArrayList<>();
    }

    public List<String> play(String str) {
        if (words.size() > 0)
        {
            String last = words.get(words.size()-1);

            if (words.contains(str))
            {
                game_over = true;
                System.out.println(str+" has already been used");
                return new ArrayList<>();
            }

            if (str.charAt(0) != last.charAt(last.length()-1))
            {
                game_over = true;
                System.out.println(str+" does not start with a / an "+last.charAt(last.length()-1));
                return new ArrayList<>();
            }
        }
        if (!game_over)
        {
            words.add(str);
            return words;
        }
        else
        {
            restart();
            return Collections.singletonList("game over");
        }
    }

    public String restart()
    {
        game_over = false;
        words.clear();
        return "game restarted";
    }

    public List<String> printWords()
    {
        return words;
    }

}

