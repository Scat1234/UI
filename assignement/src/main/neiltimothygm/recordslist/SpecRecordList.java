package com.neiltimothygm.recordslist;

import com.neiltimothygm.records.Record;
import com.neiltimothygm.records.SpecRecord;
import java.util.ArrayList;
import java.util.List;

/**
 * This class provides a method that can extract the state of a SPEC Record Object
 * @Author Neil Timothy
 * @Version 1.0
 */
public class SpecRecordList implements GetRecordsState {
    private List <String> list;

    /**
     * This method extracts all the attributes of a SPEC record Object
     * @param record a SPEC record object
     * @return a List of String that contain the state of the SPEC record Object
     */
    public List<String> getRecordState(Record record) {
        SpecRecord specRecord = (SpecRecord) record;
        list = new ArrayList<>();

        if(specRecord instanceof SpecRecord) {
            list.add(specRecord.getSpec());
            list.add(specRecord.getSpecId());
            list.add(specRecord.getStartDate());
            list.add(specRecord.getEndDate());
            if(specRecord.getCpl()!= null) {
                list.add(specRecord.getCpl());
            } else {
                list.add("");
            }
            if(specRecord.getModel()!= null) {
                list.add(specRecord.getModel());
            } else {
                list.add("");
            }
            if(specRecord.getOpt()!= null) {
                list.add(specRecord.getOpt());
            } else {
                list.add("");
            }
            if(specRecord.getSource()!= null) {
                list.add(specRecord.getSource());
            } else {
                list.add("");
            }
            list.add(specRecord.getSOL());
        }
        return list;
    }
}
