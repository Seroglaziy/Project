package ReplayModul7.Task1.Task4;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Семья on 18.01.2017.
 */
public class Main {
    public static void main(String[] args) {

        List<Integer> intArrayList = new ArrayList<>();
        List<Integer> intLinkedList = new LinkedList<>();
        List<String> strArrayList = new ArrayList<>();
        List<String> strLinkedList = new LinkedList<>();

        System.out.println("Results for collections with 1000 elements");
        int count = 1000;
        System.out.println("Add method:");
        addMethodDurationCalcForInteger(intArrayList, count);
        addMethodDurationCalcForInteger(intLinkedList, count);
        addMethodDurationCalcForString(strArrayList, count);
        addMethodDurationCalcForString(strLinkedList, count);
        System.out.println("Set method:");
        setMethodDurationCalcForInteger(intArrayList, count);
        setMethodDurationCalcForInteger(intLinkedList, count);
        setMethodDurationCalcForString(strArrayList, count);
        setMethodDurationCalcForString(strLinkedList, count);
        System.out.println("Get method:");
        getMethodDurationCalcForInteger(intArrayList, count);
        getMethodDurationCalcForInteger(intLinkedList, count);
        getMethodDurationCalcForString(strArrayList, count);
        getMethodDurationCalcForString(strLinkedList, count);
        System.out.println("Remove method:");
        removeMethodDurationCalcForInteger(intArrayList, count);
        removeMethodDurationCalcForInteger(intLinkedList, count);
        removeMethodDurationCalcForString(strArrayList, count);
        removeMethodDurationCalcForString(strLinkedList, count);
        System.out.println("***");
        System.out.println("Results for collections with 10000 elements");
        count = 10000;
        System.out.println("Add method:");
        addMethodDurationCalcForInteger(intArrayList, count);
        addMethodDurationCalcForInteger(intLinkedList, count);
        addMethodDurationCalcForString(strArrayList, count);
        addMethodDurationCalcForString(strLinkedList, count);
        System.out.println("Set method:");
        setMethodDurationCalcForInteger(intArrayList, count);
        setMethodDurationCalcForInteger(intLinkedList, count);
        setMethodDurationCalcForString(strArrayList, count);
        setMethodDurationCalcForString(strLinkedList, count);
        System.out.println("Get method:");
        getMethodDurationCalcForInteger(intArrayList, count);
        getMethodDurationCalcForInteger(intLinkedList, count);
        getMethodDurationCalcForString(strArrayList, count);
        getMethodDurationCalcForString(strLinkedList, count);
        System.out.println("Remove method:");
        removeMethodDurationCalcForInteger(intArrayList, count);
        removeMethodDurationCalcForInteger(intLinkedList, count);
        removeMethodDurationCalcForString(strArrayList, count);
        removeMethodDurationCalcForString(strLinkedList, count);

    }

    private static void addMethodDurationCalcForInteger(List<Integer> inputList, int count) {
        Calendar startTime = Calendar.getInstance();
        for (int i = 0; i < count; i++) {
            inputList.add(i);
        }
        Calendar endTime = Calendar.getInstance();
        System.out.println(count + " add method calls for " + inputList.getClass() + "<Integer>: " + (endTime.getTimeInMillis() - startTime.getTimeInMillis()));
    }

    private static void addMethodDurationCalcForString(List<String> inputList, int count) {
        Calendar startTime = Calendar.getInstance();
        for (int i = 0; i < count; i++) {
            inputList.add("Str" + i);
        }
        Calendar endTime = Calendar.getInstance();
        System.out.println(count + " add method calls for " + inputList.getClass() + "<String>: " + (endTime.getTimeInMillis() - startTime.getTimeInMillis()));
    }

    private static void setMethodDurationCalcForInteger(List<Integer> inputList, int count) {
        Calendar startTime = Calendar.getInstance();
        for (int i = 0; i < count; i++) {
            inputList.set(i, 2 * i);
        }
        Calendar endTime = Calendar.getInstance();
        System.out.println(count + " set method calls for " + inputList.getClass() + "<Integer>: " + (endTime.getTimeInMillis() - startTime.getTimeInMillis()));
    }

    private static void setMethodDurationCalcForString(List<String> inputList, int count) {
        Calendar startTime = Calendar.getInstance();
        for (int i = 0; i < count; i++) {
            inputList.set(i, "Str2" + i);
        }
        Calendar endTime = Calendar.getInstance();
        System.out.println(count + " set method calls for " + inputList.getClass() + "<String>: " + (endTime.getTimeInMillis() - startTime.getTimeInMillis()));
    }

    private static void getMethodDurationCalcForInteger(List<Integer> inputList, int count) {
        Calendar startTime = Calendar.getInstance();
        for (int i = 0; i < count; i++) {
            inputList.get(i);
        }
        Calendar endTime = Calendar.getInstance();
        System.out.println(count + " get method calls for " + inputList.getClass() + "<Integer>: " + (endTime.getTimeInMillis() - startTime.getTimeInMillis()));
    }

    private static void getMethodDurationCalcForString(List<String> inputList, int count) {
        Calendar startTime = Calendar.getInstance();
        for (int i = 0; i < count; i++) {
            inputList.get(i);
        }
        Calendar endTime = Calendar.getInstance();
        System.out.println(count + " get method calls for " + inputList.getClass() + "<String>: " + (endTime.getTimeInMillis() - startTime.getTimeInMillis()));
    }

    private static void removeMethodDurationCalcForInteger(List<Integer> inputList, int count) {
        Calendar startTime = Calendar.getInstance();
        for (int i = 0; i < count; i++) {
            inputList.remove(0);
        }
        Calendar endTime = Calendar.getInstance();
        System.out.println(count + " remove method calls for " + inputList.getClass() + "<Integer>: " + (endTime.getTimeInMillis() - startTime.getTimeInMillis()));
    }

    private static void removeMethodDurationCalcForString(List<String> inputList, int count) {
        Calendar startTime = Calendar.getInstance();
        for (int i = 0; i < count; i++) {
            inputList.remove(0);
        }
        Calendar endTime = Calendar.getInstance();
        System.out.println(count + " remove method calls for " + inputList.getClass() + "<String>: " + (endTime.getTimeInMillis() - startTime.getTimeInMillis()));
    }
}

