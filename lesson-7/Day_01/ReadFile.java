package Day_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;


public class ReadFile {
    private static ArrayList<Integer> results = new ArrayList<Integer>();
    public static void main(String[] args) {
        try {
            File myObj = new File("Day_01/Day01.txt");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (data.trim().equals(""))
                {
                    results.add(-1);
                    continue;
                }

                results.add(Integer.parseInt(data));

            }
            results.add(-1);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public int returnValueOfIndex(int index)
    {
        main(new String[]{""});
        return results.get(index);
    }

}