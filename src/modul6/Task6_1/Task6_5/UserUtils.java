package modul6.Task6_1.Task6_5;



/**
 * Created by Семья on 02.12.2016.
 */
public class UserUtils {
    public static void main(String[] args) {


    }
    public static User[] uniqueUsers(User[] users) {
        int index = 0;
        User[] uniqueUser = new User[users.length];
        for (int i = 0; i < users.length; i++) {
            for (int j = 0; j < users.length; j++) {
                if (users[i].equals(uniqueUser[j])) {
                    break;
                } else if (j == users.length - 1) {
                    uniqueUser[index] = users[i];
                    index++;
                }
            }
        }
        return UserUtils.deleteEmptyUser(uniqueUser);
    }
    public static User[] deleteEmptyUser(User[] users) {
        int count = 0;
        for (User r : users) {
            if (r != null) {
                count++;
            }
        }
        User[] foundUsers = new User[count];
        int index = 0;
        for (User r : users) {
            if (r != null) {
                foundUsers[index] = r;
                index++;
            }
        }
        return foundUsers;
    }

  // public static User[] uniqueUsers(User[] users) {
  //     boolean maska[] = new boolean[users.length];
  //     int removeCount = 0;

  //     for (int i = 0; i < users.length; i++) {
  //         if (!maska[i]) {
  //             User tmp = users[i];

  //             for (int j = i + 1; j < users.length; j++) {
  //                 if (tmp.equals(users[j])) {
  //                     maska[j] = true;
  //                     removeCount++;
  //                 }
  //             }
  //         }
  //     }
  //     User[] uniq = new User[users.length - removeCount];


  //     for (int i = 0; i < users.length; i++) {
  //         if (!maska[i]) {
  //             uniq[i++] = users[i];
  //         }
  //     }

  //     return uniq;





    public static User[] usersWithContitionalBalance(User[] users, int balance) {
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

     public static final User[] paySalaryToUsers(User[] users) {
        for (int i = 0; i < users.length; i++) {
            users[i].setBalance(users[i].getBalance() + users[i].getSalary());
        }
        return users;
    }

    public static long[] getUsersId(User[] users) {
        long[] usID = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            usID[i] = users[i].getId();
        }
        return usID;
    }

 //  public static User[] deleteEmptyUsers(User[] users) {
 //      User[] needUsers = new User[0];
 //      for (int i = 0; i < users.length; i++) {
 //          if (users[i] != null) {
 //              User[] same = new User[needUsers.length + 1];
 //              System.arraycopy(needUsers, 0, same, 0, needUsers.length);
 //              needUsers = same;
 //              needUsers[needUsers.length - 1] = users[i];
 //          }
 //      }
 //      return needUsers;
    }


















