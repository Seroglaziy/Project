package modul6.Task6_1.Task6_5;



/**
 * Created by Семья on 02.12.2016.
 */
    public class UserUtils {
        public static User[] uniqueUsers(User[] users) {
            int arLength = users.length;
            User[] tempArray = new User[arLength];
            int uniqueUsersCount = 0;
            for (int i = 0; i < arLength; i++) {
                if (users[i]!=null) {
                    int equalCount = 0;
                    for (int j = 0; j < arLength; j++) {
                        if (i != j && users[i].equals(users[j])) {
                            equalCount++;
                        }
                    }
                    if (equalCount == 0) {
                        tempArray[uniqueUsersCount] = users[i];
                        uniqueUsersCount++;
                    }
                }
            }
            return arrayProcessing(tempArray, uniqueUsersCount);
        }

        public static User[] usersWithConditionalBalance(User[] users, int balance) {
            User[] tempArray = new User[users.length];
            int userCount = 0;
            for (User user : users) {
                if (user != null && user.getBalance() == balance) {
                    tempArray[userCount] = user;
                    userCount++;
                }
            }
            return arrayProcessing(tempArray, userCount);
        }

        public final static User[] paySalaryToUser(User[] users) {
            for (User user : users) {
                if(user != null) {
                    user.setBalance(user.getBalance() + user.getSalary());
                }
            }
            return users;
        }

        public final static long[] getUsersId(User[] users) {
            long[] usersId = new long[users.length];
            int index = 0;
            for (User user : users) {
                if (user != null) {
                    usersId[index] = user.getId();
                    index++;
                }
            }
            if (index > 0){
                long[] resultArray = new long[index];
                System.arraycopy(usersId, 0 , resultArray, 0, index);
                return resultArray;
            } else {
                return null;
            }
        }

        public static User[] deleteEmptyUsers(User[] users) {
            int usersCount = 0;
            User[] tempArray = new User[users.length];
            for (User user : users) {
                if (user != null) {
                    tempArray[usersCount] = user;
                    usersCount++;
                }
            }
            return arrayProcessing(tempArray, usersCount);
        }

        private static User[] arrayProcessing(User[] array, int count) {
            if (count <= 0) {
                return null;
            } else {
                User[] resultArray = new User[count];
                System.arraycopy(array, 0, resultArray, 0, count);
                return resultArray;
            }
        }
    }