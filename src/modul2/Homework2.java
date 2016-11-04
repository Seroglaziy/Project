package modul2;


import java.util.Arrays;

/**
 * Created by Семья on 02.11.2016.
 */
public class Homework2 {


    public static void main(String[] args) {

        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] array2 = new double[]{0.5, 1.3, 7, -0.5, 20.5, 13, -11.5, 17, -9.8 , 31.1};

        System.out.println(sum_array1(array1));
        System.out.println(sum_array2(array2));
        System.out.println(min1(array1));
        System.out.println(max1(array1));
        System.out.println(min2(array2));
        System.out.println(max2(array2));
        System.out.println(maxPositive1(array1));
        System.out.println(maxPositive2(array2));
        System.out.println(multiplication(array1));
        System.out.println(multiplication2(array2));
        System.out.println(modulus1(array1));
        System.out.println(modulus2(array2));
        System.out.println(sLarg2(array2));






    }




    static int sum_array1(int array1[]) {
        int sum1 = 0;
        for (int i = 0; i < array1.length; i++)
            sum1 += array1[i];
        return sum1;

    }

    static double sum_array2(double array2[]) {
        double sum2 = 0;
        for (int i = 0; i < array2.length; i++)
            sum2 += array2[i];
        return sum2;


    }

    static int min1(int array1[]) {
        int min1 = array1[0];
        for (int i = 1; i < array1.length; i++)
            if (array1[i] < min1)
                min1 = array1[i];
        return (min1);
    }


    static int max1(int array1[]) {
        int max1 = array1[0];
        for (int j = 1; j < array1.length; j++)
            if (array1[j] > max1)
                max1 = array1[j];
        return (max1);

    }

    static double min2(double array2[]) {
        double min2 = array2[0];
        for (int i = 1; i < array2.length; i++)
            if (array2[i] < min2)
                min2 = array2[i];
        return (min2);
    }


    static double max2(double array2[]) {
        double max2 = array2[0];
        for (int i = 1; i < array2.length; i++)
            if (array2[i] > max2)
                max2 = array2[i];
        return (max2);
    }


    static int maxPositive1(int array1[]) {
        int maxPositive1 = array1[0];
        for (int i = 1; i < array1.length; i++)
            if (array1[i] > maxPositive1)
                maxPositive1 = array1[i];
        return (maxPositive1);
    }

    static double maxPositive2(double array2[]) {
        double maxPositive2 = array2[0];
        for (int j = 1; j < array2.length; j++)
            if (array2[j] > maxPositive2)
                maxPositive2 = array2[j];
        return (maxPositive2);
    }

            static int multiplication(int array1[]) {
                    int multiplication = array1[0];
                    for (int i = 1; i < array1.length; i++) {
                        multiplication = multiplication * i;
                    }
                    return multiplication;
                }




                static double multiplication2(double array2[]){
                double multiplication2 = array2[0];
                for (double i = 1; i < array2.length; i++){
                 multiplication2 = multiplication2 * i;
        }
                return multiplication2;
            }
                     static int modulus1 (int array1[]){
                     int modulus1 = 10;
                     for (int i = 1; i <= 10; i++){
                         System.out.println(modulus1 + "%" + i + "=" + modulus1 % i);
                              }
                              return modulus1;
                      }

                      static double modulus2 (double array2[]){
                          double modulus2 = 20.5;
                          for (double i = 1; i <= 20.5; i++){
                              System.out.println(modulus2 + "%" + i + "=" + modulus2 % i);

                          }
                          return modulus2;

                      }

                        static double sLarg2(double array2[]) {
                        Arrays.sort(array2);
                        double slarg2 = array2[8];
                        return slarg2;
    }
                      }

















































































