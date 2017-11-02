package com.neiltimothygm.filereaders;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *This class provides a method to read a file in String format and return a List of Strings
 *@author Neil Timothy
 * @version 1.0
 */
public class DatFileReader {

    /**
     * This method reads a file and converts each line into a List of Strings
     * @param filePath the location of the file
     * @return a String List of each line found within the file
     */
    public List<String> getEachRecord(String filePath) {
        String currentLine;
        String splitBy = "\\\\r?\\\\n";
        BufferedReader bufferedReader = null;
        ArrayList<String> allRecords  = new ArrayList<>();

        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            while ((currentLine = bufferedReader.readLine()) != null) {
                if (currentLine.length() > 0) {
                    String[] datData = currentLine.split(splitBy);
                    allRecords.add(datData[0]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return allRecords;
    }
}
