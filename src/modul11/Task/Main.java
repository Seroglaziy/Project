package modul11.Task;


import java.io.*;
import java.util.*;

/**
 * Created by Семья on 25.01.2017.
 */
public class Main {

    private static File sourceFile;
    private final static String filePath = "src/modul11/Task/";
    private final static String fileName = "source.txt";

    public static void main(String[] args) {


        Map<String, String> replaceMap = new HashMap<>();
        replaceMap.put("first", "second");

        sourceFile = new File(filePath + fileName);

        System.out.println("Lines in what words were replaced (separated by '/'):");
        System.out.println(replacer(replaceMap));

        sourceFile = fileContentReplacer(replaceMap);

        replaceMap.clear();
        replaceMap.put("third", "fourth");
        sourceFile = fileContentMerger(replaceMap);

        String stringToFind = "second";

        int count = checkWord(stringToFind);
        System.out.println("Word \"" + stringToFind + "\" found " + count + " times in file.");


    }

    private static int checkWord(String stringToFind) {
        int count = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(sourceFile))){
            String line = br.readLine();

            while (line != null){
                count = count + (int) Arrays.stream(line.split("\\s+")).filter(s -> s.equals(stringToFind)).count();
                line = br.readLine();
            }

        } catch (IOException e){
            e.printStackTrace();
        }

        return count;
    }

    private static File fileContentMerger(Map<String, String> replaceMap) {
        List<String> stringList = new ArrayList<>();
        for (Map.Entry<String,String> entry : replaceMap.entrySet()){
            String oldValue = entry.getKey();
            String newValue = entry.getValue();
            BufferedReader br;
            BufferedWriter bw = null;

            try {
                br = new BufferedReader(new FileReader(sourceFile));
                String line = br.readLine();
                int index = 0;

                while (line != null){
                    stringList.add(index, line.replace(oldValue, newValue));
                    index++;
                    line = br.readLine();
                }

                try {
                    br.close();
                } catch (IOException e){
                    e.printStackTrace();
                }

                try {
                    bw = new BufferedWriter(new FileWriter(sourceFile, true));
                    for (String s : stringList) {
                        bw.write(s);
                        bw.newLine();
                    }

                    try {
                        bw.close();
                    } catch (IOException e){
                        e.printStackTrace();
                    }
                } catch (IOException e){
                    e.printStackTrace();
                }

            } catch (IOException e){
                e.printStackTrace();
            }
        }

        return sourceFile;
    }

    private static File fileContentReplacer(Map<String, String> replaceMap) {
        File temp = new File(filePath + "tmp.txt");
        for (Map.Entry<String, String> entry : replaceMap.entrySet()) {
            String oldValue = entry.getKey();
            String newValue = entry.getValue();

            try {
                BufferedReader br = new BufferedReader(new FileReader(sourceFile));
                BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
                String line = br.readLine();
                while (line != null) {
                    bw.write(line.replaceAll(oldValue, newValue));
                    bw.newLine();
                    line = br.readLine();
                }

                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        sourceFile.delete();
        temp.renameTo(sourceFile);
        return sourceFile;
    }

    private static String replacer(Map<String, String> replaceMap) {
        String replacedLines = "";
        for (Map.Entry<String, String> entry : replaceMap.entrySet()) {
            String oldValue = entry.getKey();
            String newValue = entry.getValue();

            try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
                String line = br.readLine();
                while (line != null) {
                    if (!line.equals(line.replaceAll(oldValue, newValue))) {
                        replacedLines = replacedLines + line + " / ";
                    }
                    line = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return replacedLines;
    }

}
