package modul2.Homework;

/**
 * Created by Семья on 09.11.2016.
 */
public class Bank2 {
        public static void main(String[] args) {
            String a = "Jack";
            with(a, 399);
        }


        public static double with(String a, double withdrawal) {
            int[] balances = {1200, 250, 2000, 500, 3200};
            String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
            double b = 0;
            int index = 0;
            for (String s : ownerNames) {
                if (s.contentEquals(a)) {
                    b = balances[index];
                }
                index++;
            }
            double com = withdrawal * 0.05;
            double tot = withdrawal + com;
            if (tot > b)
                System.err.println(a + " NO");
            else {
                b = b - tot;
                System.out.println(a + " " + withdrawal + " " + b);
            }
            return b;
        }
    }

