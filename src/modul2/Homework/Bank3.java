package modul2.Homework;

/**
 * Created by Семья on 09.11.2016.
 */
public class Bank3 {
        public static void main(String[] args) {
            String ownerName = "Oww";
            double withdrawal = 1020;
            System.out.println(found(ownerName, withdrawal));
        }

        private static double found(String ownerName, double withdrawal) {
            int[] balances = {1200, 250, 2000, 500, 3200};
            String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
            double b = 0;
            int index = 0;
            for (String s : ownerNames) {
                if (s.contentEquals(ownerName)) {
                    b = balances[index];
                    break;
                }
                index++;
            }
            return b + withdrawal;
        }

    }

