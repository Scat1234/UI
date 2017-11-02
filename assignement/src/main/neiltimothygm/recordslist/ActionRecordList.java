package com.neiltimothygm.recordslist;

import com.neiltimothygm.records.ActionRecord;
import com.neiltimothygm.records.Record;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides a method that can get the state of a ACTION Record Object
 * @Author Neil Timothy
 * @Version 1.0
 */
public class ActionRecordList implements GetRecordsState {
    private List <String> list;

    /**
     * This method extracts all the attributes of a ACTION record object
     * @param record an ACTION record object
     * @return a List of String that contain the state of the ACTION record Object
     */
    public List<String> getRecordState(Record record){
        ActionRecord actionRecord = (ActionRecord) record;
        list = new ArrayList<>();

        if(actionRecord instanceof ActionRecord){
            list.add(actionRecord.getAction());
            list.add(actionRecord.getActive());
            list.add(actionRecord.getAction());
            list.add(actionRecord.getOrderNum());
            list.add(actionRecord.getSource());
            if(actionRecord.getComment()!= null) {
                list.add(actionRecord.getComment());
            } else {
                list.add(" ");
            }
        }
        return list;
    }
}
