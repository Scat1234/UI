package com.neiltimothygm.filereaders;
import java.util.ArrayList;

/**
 * This class provides methods to extract data from a record
 * @Author Neil Timothy
 * @Version 1.0
 */
public class RecordReader {

    /**
     * This method checks the first character found in position zero of a record
     * @param record to be evaluated
     * @param a the character to be validated against
     * @return true if char 'a' is found at position zero, otherwise false
     */
    public boolean checkPosOne(String record, char a){
        return record.charAt(0) == a;
        }

    /**
     * This method validate a record by its length
      * @param record to be evaluated
     * @return true if record has eighty characters, otherwise false
     */
    public boolean isRecord(String record) {
        return record.length() == 80;
    }

    /**
     * This method validates if a record is a SPEC record
     * @param record to be evaluated
     * @return true if "SPEC" is found at index position 9, otherwise returns -1
     */
    public boolean isSpec (String record) {
        return record.indexOf("SPEC", 9) != -1;
    }

    /**
     * This method verifies if the current line is the last line of a SPEC record
     * @param record to be evaluated
     * @return true if SOL is found from index position 9, otherwise returns -1
     */
    public boolean endOfSpec(String record) {
        return record.indexOf("SOL", 9) != -1;
    }

    /**
     * This method extracts the starting date data of a SPEC record
     * @param record to be evaluated
     * @return a trimmed substring of the characters found at position 32 (inclusive) and 38 (exclusive)
     */
    public String getSpecStartDate(String record) {
        String details = record.substring(32,38);
        return details.trim();
    }

    /**
     * This method extracts the end date data data of a SPEC record
     * @param record to be evaluated
     * @return a trimmed substring of the characters found at position 39 (inclusive) and 45 (exclusive)
     */
    public String getSpecEndDate(String record) {
        String details = record.substring(39,45);
        return details.trim();
    }

    /**
     * This method extracts the end date data of a SPEC record
     * @param record to be evaluated
     * @return a trimmed substring of the characters found at position 39 (inclusive) and 45 (exclusive)
     */
    public String getSpecID(String record) {
        return record.substring(1,7);
    }

    //Returns Spec details type
    public String getSpecDetails(String record) {
        String details = record.substring(20,27);
        return details.trim();
    }

    /**
     * This method extracts the SPEC data of a SPEC record
     * @param record to be evaluated
     * @return a trimmed substring of all the characters found at position 31 (inclusive). Any "," characters have been replaced with a space
     */
    //Returns the Spec data
    public String getSpecData(String record) {
        String specData = record.substring(31);
        specData = specData.replace(',', ' ');
        return specData.trim();
    }

    /**
     * This method returns the spec type
     * @param specDetails
     * @return
     */
    //Get the spec details
    public String getSpecDetailsType(String specDetails){
       String specDetailsType;
        switch(specDetails) {
            case "CPL":
                specDetailsType = "CPL";
                break;
            case "E MODEL":
                specDetailsType = "E MODEL";
                break;
            case "source":
                specDetailsType = "source";
                break;
            case "OPT":
                specDetailsType = "OPT";
                break;
            default:
                specDetailsType = "";
        }
        return specDetailsType;
    }

    //TODO Refactor into own class
    /**
     * This method verifies if the record passed in a ACTION Record
     * @param record record to be evaluated
     * @return true if the substring of the characters found at position 20 (inclusive) and 30 (exclusive) contain "ORDER HOLD" or "ORDER RLSE", otherwise returns false
     */
    public boolean isActionRecord (String record) {
        if(record.substring(20,30).equals("ORDER HOLD") || record.substring(20,30).equals("ORDER RLSE")) {
            return true;
        }
        return false;
    }

    /**
     * This method get the ACTION type information of a ACTION record
     * @param record to be evaluated
     * @return a substring of the characters found at position 20 (inclusive) and 30 (exclusive)
     */
    public String getActionType(String record) {return record.substring(20,30);}

    /**
     * This method get the order information of a ACTION record
     * @param record to be evaluated
     * @return a substring of the characters found at position 32 (inclusive) and 38 (exclusive)
     */
    public String getActionNum(String record) {
        return record.substring(32,38);
    }

    /**
     * This method get the source information of the ACTION record
     * @param record to be evaluated
     * @return a substring of the characters found at position 38 (inclusive) and 40 (exclusive)
     */
    public String getActionsource(String record) {
        return record.substring(38,40);
    }

    /**
     * This method get the Comment information of the ACTION
     * @param record to be evaluated
     * @return a trimmed substring of all the characters found at position 41 (inclusive) and after
     */
    public String getActionComment(String record) {
        String comment = record.substring(41);
        return comment.trim();
    }

    /**
     * This Method removes the headers found within a file
     * @param allRecords an ArrayList of Strings representing each record
     * @return an ArrayList of all the records with the first 7 lines removed from a file
     */
    public ArrayList<String> removeHeader(ArrayList<String> allRecords) {
        for(int i =0; i<7; i++) {
            allRecords.remove(0);
        }
        return allRecords;
    }
}



