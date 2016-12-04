package modul6.Task6_1;


import java.util.Arrays;

/**
 * Created by Семья on 02.12.2016.
 */
public final class ArraysUtils {


    public static void main(String[] args) {


        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        System.out.println(sum(array));
        System.out.println(min(array));
        System.out.println(max(array));
        System.out.println(maxPositive(array));
        System.out.println(multiplication(array));
        System.out.println(modulus(array));
        System.out.println(secondLargest(array));
        System.out.println(Arrays.toString(reverse(array)));
        System.out.println(Arrays.toString(findEvenElements(array)));


    }


    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i];
        return sum;

    }


    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++)
            if (array[i] < min)
                min = array[i];
        return (min);
    }


    public static int max(int[] array) {
        int max = array[0];
        for (int j = 1; j < array.length; j++)
            if (array[j] > max)
                max = array[j];
        return max;

    }


    public static int maxPositive(int[] array) {
        int maxPositive = array[0];
        for (int i = 1; i < array.length; i++)
            if (array[i] > maxPositive)
                maxPositive = array[i];
        return maxPositive;
    }


    public static int multiplication(int[] array) {
        int multiplication = array[0];
        for (int i = 1; i < array.length; i++) {
            multiplication = multiplication * i;
        }
        return multiplication;
    }


    public static int modulus(int[] array) {
        int modulus = 10;
        for (int i = 1; i < array.length; i++) {
            System.out.println(modulus + "%" + i + "=" + modulus % i);
        }
        return modulus;
    }

    public static int secondLargest(int[] array) {
        Arrays.sort(array);
        int secondLargest = array[8];
        return secondLargest;

    }
    public static int[] reverse(int[] array) {
        int a = array.length;
        int b = 0;
        int[] rev = new int[a];
        for (int i = a-1; i >= 0; i--) {
            rev[b] = array[i];
            b++;
        }
        return rev;
    }

    public static int[] findEvenElements(int[] array) {
        int[] elements = new int[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                int[] same = new int[elements.length + 1];
                System.arraycopy(elements, 0, same, 0, elements.length);
                elements = same;
                elements[elements.length - 1] = array[i];
            }
        }
        return elements;




    }
}




