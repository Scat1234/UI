package com.neiltimothygm.testmain;
import com.neiltimothygm.csvconverter.CsvConverter;

/**
 * This class provided a method to testmain the OFPI program
 * @Author Neil Timothy
 * @Version 1.0
 */
public class DummyMain {

    public static void main (String args[]) {
        String filePath = "C:\\Users\\DZJPG1\\IdeaProjects\\OFPI\\src\\com\\neiltimothygm\\SampleDatFile.dat";
        CsvConverter csvConverter = new CsvConverter();
        csvConverter.converter(filePath);
        csvConverter.convertSpecRecord(filePath);
        csvConverter.converterActionRecord(filePath);
    }

}
