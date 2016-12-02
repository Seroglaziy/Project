package modul6;

/**
 * Created by Семья on 02.12.2016.
 */
public class ArraysUtils {


    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


       System.out.println(sum(array));
       System.out.println(min(array));
       System.out.println(max(array));
       System.out.println(maxPositive(array));
       System.out.println(multiplication(array));
       System.out.println(modulus(array));
       System.out.println(secondLargest(array));
    }


    static int sum(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i];
        return sum;
    }

    static int min(int array[]) {
        int min = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] < min)
                min = array[i];
        return min;
    }

    static int max(int array[]) {
        int max = 10;
        for (int j = 1; j < array.length; j++)
            if (array[j] > max)
                max = array[j];
        return max;


    }

    static int maxPositive(int array[]) {
        int maxPositive = 10;
        for (int i = 1; i < array.length; i++)
            if (array[i] > maxPositive)
                maxPositive = array[i];
        return maxPositive;
    }

    static int multiplication(int array[]) {
        int multiplication = 0;
        for (int i = 1; i < array.length; i++)
            multiplication = multiplication * i;
        return multiplication;
    }

    static int modulus(int array[]) {
        int modulus = 10;
        for (int i = 1; i <= array.length; i++)
            System.out.println(modulus + "%" + i + "=" + modulus % i);
        return modulus;
    }

    static int secondLargest(int array[]) {
        int secondLargest = 9;
        for (int i = 0; i < array.length; i++)
            secondLargest += array[i];
        return secondLargest;



    }
}




