package Day_01;

public class Task_01 {

    public static void main(String[] args) {
        int maximum = 0;
        int local_maximum = 0;
        for (int i = 0; i < 2300; i++) {
            int tmp = new ReadFile().returnValueOfIndex(i);
            if (tmp != -1)
            {
                local_maximum = local_maximum + tmp;
                maximum = Math.max(local_maximum, maximum);
            }
            else
            {
                local_maximum = 0;
            }
        }
        System.out.println(maximum);
    }
}