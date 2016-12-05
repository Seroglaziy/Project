package modul6.Task6_1.Task6_5;


/**
 * Created by Семья on 02.12.2016.
 */
public class UserUtils {
       public static void main(String[] args) {

       }

       public User[] uniqueUsers(User[] users) {
              boolean maska[] = new boolean[users.length];
              int removeCount = 0;

              for (int i = 0; i < users.length; i++) {
                     if (!maska[i]) {
                            User tmp = users[i];

                            for (int j = i + 1; j < users.length; j++) {
                                   if (tmp.equals(users[j])) {
                                          maska[j] = true;
                                          removeCount++;
                                   }
                            }
                     }
              }

              User[] uniq = new User[users.length - removeCount];

              for (int i = 0, j = 0; i < users.length; i++) {
                     if (!maska[i]) {
                            uniq[j++] = users[i];
                     }
              }

              return uniq;
       }

       public User[] usersWithContitionalBalance(User[] users, int balance) {
              User[] needUsers = new User[0];
              for (int i = 0; i < users.length; i++) {
                     if (users[i].getBalance() == balance) {
                            User[] same = new User[needUsers.length + 1];
                            System.arraycopy(needUsers, 0, same, 0, needUsers.length);
                            needUsers = same;
                            needUsers[needUsers.length - 1] = users[i];

                     }
              }
              return needUsers;
       }

       public  User[] paySalaryToUsers(User[] users) {
              for (int i = 0; i < users.length; i++) {
                     users[i].setBalance(users[i].getBalance() + users[i].getSalary());
              }
              return users;
       }

       public  long[] getUsersId(User[] users) {
              long[] usID = new long[users.length];
              for (int i = 0; i < users.length; i++) {
                     usID[i] = users[i].getId();
              }
              return usID;
       }
       public User[] deleteEmptyUsers(User[] users){
              User[] needUsers = new User[0];
              for (int i = 0; i < users.length; i++) {
                     if (users[i]!=null){
                            User[] same = new User[needUsers.length + 1];
                            System.arraycopy(needUsers, 0, same, 0, needUsers.length);
                            needUsers = same;
                            needUsers[needUsers.length - 1] = users[i];
                     }
              }
              return needUsers;
       }






}










