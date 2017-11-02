package com.neiltimothygm.csvconverter;

import com.neiltimothygm.filereaders.DatFileReader;
import com.neiltimothygm.recordcreator.ActionRecordCreator;
import com.neiltimothygm.recordcreator.SpecRecordCreator;
import com.neiltimothygm.records.Record;
import com.neiltimothygm.recordslist.ActionRecordList;
import com.neiltimothygm.recordslist.SpecRecordList;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * This class provides a method to convert a DAT file to a CSV file
 * @Author Neil Timothy
 * @Version 1.0
 */
public class CsvConverter {




    /**
     * This method converts a DAT file records data to a CSV file with each record representing a new row in the CSV file
     * @param filepath to file that will be converted to a CSV file
     */
    public void converter(String filepath) {
        List<String> eachRecordList;
        List <Record> specRecordsList;
        List <Record> actionRecordsList;
        FileWriter writer                       =   null;
        String csvFile                          =   "AllRecords.csv";
        CSVUtils csvUtils                       =   new CSVUtils();
        DatFileReader fileReader                =   new DatFileReader();
        SpecRecordList specRecordList           =   new SpecRecordList();
        ActionRecordList actionRecordList       =   new ActionRecordList();
        SpecRecordCreator specRecordCreator     =   new SpecRecordCreator();
        ActionRecordCreator actionRecordCreator =   new ActionRecordCreator();
        eachRecordList                          =   fileReader.getEachRecord(filepath);
        specRecordsList                         =   specRecordCreator.recordListCreator(eachRecordList);
        actionRecordsList                       =   actionRecordCreator.recordListCreator(eachRecordList);


        try {
            writer = new FileWriter(csvFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(Record specRecord:specRecordsList) {
            try {
                csvUtils.writeLine(writer,specRecordList.getRecordState(specRecord));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        for(Record actionRecord:actionRecordsList) {
            try {
                csvUtils.writeLine(writer,actionRecordList.getRecordState(actionRecord));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            writer.close();
            System.out.println("The Conversion was successful! A CSV file containing the dat.file data been created. It can be found in the project directory to the left called \"OutPut.csv\"");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void convertSpecRecord (String filepath) {
        List<String> eachRecordList;
        List <Record> specRecordsList;
        FileWriter writer                       =   null;
        String csvFile                          =   "SpecRecordsOnly.csv";
        CSVUtils csvUtils                       =   new CSVUtils();
        DatFileReader fileReader                =   new DatFileReader();
        SpecRecordList specRecordList           =   new SpecRecordList();
        SpecRecordCreator specRecordCreator     =   new SpecRecordCreator();
        eachRecordList                          =   fileReader.getEachRecord(filepath);
        specRecordsList                         =   specRecordCreator.recordListCreator(eachRecordList);



        try {
            writer = new FileWriter(csvFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(Record specRecord:specRecordsList) {
            try {
                csvUtils.writeLine(writer,specRecordList.getRecordState(specRecord));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            writer.close();
            System.out.println("The Conversion was successful! A CSV file containing the SpecRecords data been created. It can be found in the project directory to the left called \"OutPut.csv\"");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void converterActionRecord(String filepath) {
        List<String> eachRecordList;
        List <Record> actionRecordsList;
        FileWriter writer                       =   null;
        String csvFile                          =   "ActionRecordsOnly.csv";
        CSVUtils csvUtils                       =   new CSVUtils();
        DatFileReader fileReader                =   new DatFileReader();
        ActionRecordList actionRecordList       =   new ActionRecordList();
        ActionRecordCreator actionRecordCreator =   new ActionRecordCreator();
        eachRecordList                          =   fileReader.getEachRecord(filepath);
        actionRecordsList                       =   actionRecordCreator.recordListCreator(eachRecordList);


        try {
            writer = new FileWriter(csvFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(Record actionRecord:actionRecordsList) {
            try {
                csvUtils.writeLine(writer,actionRecordList.getRecordState(actionRecord));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            writer.close();
            System.out.println("The Conversion was successful! A CSV file containing the ActionRecords data has been created. It can be found in the project directory to the left called \"OutPut.csv\"");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }







}
