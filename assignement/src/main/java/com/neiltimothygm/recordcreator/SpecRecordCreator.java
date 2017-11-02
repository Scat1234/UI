package com.neiltimothygm.recordcreator;

import com.neiltimothygm.filereaders.RecordReader;
import com.neiltimothygm.records.Record;
import com.neiltimothygm.records.SpecRecord;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides a method used to create an ArrayList of SPEC Record Objects
 * @author Neil Timothy
 * @version 1.0
 */
public class SpecRecordCreator implements RecordListCreator {
    private ArrayList<Record> SpecRecordsList;

    /**
     * This method converts a list of strings into list of SPEC record objects
     * @param recordData is a List of Strings containing record data
     * @return a list of SPEC record objects with different states
     */
    public List<Record> recordListCreator(List<String> recordData){
        SpecRecordsList = new ArrayList<>();
        RecordReader r = new RecordReader();
        char asterisk = '*';
        int positionAddTo = 0;
        SpecRecord specRecord = new SpecRecord();

        for(String data : recordData){
            if(!r.checkPosOne(data,asterisk)){
                // Checking if record is a active Spec
                if(r.isSpec(data)) {
                    specRecord.setSpec("SPEC");
                    specRecord.setSpecId(r.getSpecID(data));
                    specRecord.setStartDate(r.getSpecStartDate(data));
                    specRecord.setEndDate(r.getSpecEndDate(data));
                }
                if(r.getSpecDetails(data).equals("CPL")){
                    specRecord.setCpl(r.getSpecData(data));
                }
                if(r.getSpecDetails(data).equals("E MODEL")){
                    specRecord.setModel(r.getSpecData(data));
                }
                if(r.getSpecDetails(data).equals("source")) {
                    specRecord.setSource(r.getSpecData(data));
                }
                if(r.getSpecDetails(data).equals("OPT")) {
                    specRecord.setOpt(r.getSpecData(data));
                }
                // If last line is end of record we want to close this record
                if(r.endOfSpec(data)) {
                    SpecRecord newspecRecord = new SpecRecord();
                    specRecord.setSOL(r.getSpecData(data));
                    SpecRecordsList.add(positionAddTo, specRecord);
                    specRecord = newspecRecord;
                    positionAddTo++;
                }
            }
        }
        return SpecRecordsList;
    }
}

