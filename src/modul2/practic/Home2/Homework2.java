package modul2.practic.Home2;


import modul6.Task6_1.ArraysUtils;




import java.util.Arrays;

/**
 * Created by Семья on 02.11.2016.
 */
public class Homework2 {


    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] array2 = new double[]{0.5, 1.3, 7, -0.5, 20.5, 13, -11.5, 17, -9.8, 31.1};

        System.out.println(sum(array));
        System.out.println(sum(array2));
        System.out.println(min(array));
        System.out.println(max(array));
        System.out.println(min(array2));
        System.out.println(max(array2));
        System.out.println(maxPositive(array));
        System.out.println(maxPositive(array2));
        System.out.println(multiplication(array));
        System.out.println(multiplication(array2));
        System.out.println(modulus(array));
        System.out.println(modulus(array2));
        System.out.println(sLarg(array2));


        System.out.println("sum numbers of array" + ArraysUtils.sum(array));
        System.out.println("min number of array" + ArraysUtils.min(array));
        System.out.println("max number of array" + ArraysUtils.max(array));
        System.out.println("multiplication numbers of array" + ArraysUtils.multiplication(array));
        System.out.println("modulus first and lu" + ArraysUtils.modulus(array));
        System.out.println("second largest number of array" + ArraysUtils.secondLargest(array));
        System.out.println("second max positive number of array" + ArraysUtils.maxPositive(array));
        System.out.println("reverse numbers of array" + Arrays.toString(ArraysUtils.reverse(array)));
        System.out.println("even elements of array" + Arrays.toString(ArraysUtils.findEvenElements(array)));


    }


    static int sum(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i];
        return sum;
    }

    static double sum(double array2[]) {
        double sum = 0;
        for (int i = 0; i < array2.length; i++)
            sum += array2[i];
        return sum;
    }


    static int min(int array[]) {
        int min = array[0];
        for (int i = 1; i < array.length; i++)
            if (array[i] < min)
                min = array[i];
        return min;
    }

    static int max(int array[]) {
        int max = array[0];
        for (int j = 1; j < array.length; j++)
            if (array[j] > max)
                max = array[j];
        return max;
    }

    static double min(double array2[]) {
        double min = array2[0];
        for (int i = 1; i < array2.length; i++)
            if (array2[i] < min)
                min = array2[i];
        return (min);
    }

    static double max(double array2[]) {
        double max = array2[0];
        for (int i = 1; i < array2.length; i++)
            if (array2[i] > max)
                max = array2[i];
        return (max);
    }

    static int maxPositive(int array[]) {
        int maxPositive = array[0];
        for (int i = 1; i < array.length; i++)
            if (array[i] > maxPositive)
                maxPositive = array[i];
        return (maxPositive);
    }

    static double maxPositive(double array2[]) {
        double maxPositive = array2[0];
        for (int j = 1; j < array2.length; j++)
            if (array2[j] > maxPositive)
                maxPositive = array2[j];
        return (maxPositive);
    }

    static int multiplication(int array[]) {
        int multiplication = array[0];
        for (int i = 1; i < array.length; i++) {
            multiplication = multiplication * i;
        }
        return multiplication;
    }

    static double multiplication(double array2[]) {
        double multiplication = array2[0];
        for (double i = 1; i < array2.length; i++) {
            multiplication = multiplication * i;
        }
        return multiplication;
    }

    static int modulus(int array[]) {
        int modulus = 10;
        for (int i = 1; i <= 10; i++) {
            System.out.println(modulus + "%" + i + "=" + modulus % i);
        }
        return modulus;
    }

    static double modulus(double array2[]) {
        double modulus = 20.5;
        for (double i = 1; i <= 20.5; i++) {
            System.out.println(modulus + "%" + i + "=" + modulus % i);
        }
        return modulus;
    }

    static double sLarg(double array2[]) {
        Arrays.sort(array2);
        double slarg = array2[8];
        return slarg;
    }
}
















































































