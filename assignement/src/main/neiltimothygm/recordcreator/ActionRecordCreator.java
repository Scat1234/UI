package com.neiltimothygm.recordcreator;

import com.neiltimothygm.filereaders.RecordReader;
import com.neiltimothygm.records.ActionRecord;
import com.neiltimothygm.records.Record;
import java.util.ArrayList;
import java.util.List;

/**
 * This class provides a method to create an ArrayList of ACTION Record Objects
 * @author Neil Timothy
 * @version 1.0
 */
public class ActionRecordCreator implements RecordListCreator {
    private ArrayList<Record> actionRecordsList;

    /**
     * This method converts a list of Strings into list of ACTION Record Objects
     * @param recordData is a List of Strings containing record data
     * @return a list of ACTION record objects with different states
     */
    public List<Record> recordListCreator(List<String> recordData){
         actionRecordsList = new ArrayList<>();
        RecordReader r = new RecordReader();
        char posOne ='*';
        for(String data : recordData) {

            if(r.isActionRecord(data)){
                   ActionRecord actionRecord = setActionRecordAction(data);
                   actionRecord.setType("ACTN");
                   actionRecord.setAction(r.getActionType(data));
                   actionRecord.setOrderNum(r.getActionNum(data));
                   actionRecord.setSource(r.getActionsource(data));
                   actionRecord.setComment(r.getActionComment(data));
                   if(r.checkPosOne(data,posOne )){
                       actionRecord.setActive("Y");
                   } else {
                       actionRecord.setActive("N");
                   }
                   actionRecordsList.add(actionRecord);
                } else{
                  /* System.out.println("Not a Order Rlse or Order Hold Record");*/
               }
          }

        return actionRecordsList;
    }

    /**
     * This method sets the action state of a ACTION record depending on the data passed in
     * @param record a string of the Action belonging
     * @return returns a Action Record with its action state set
     */
    //Set State of Order
    public ActionRecord setActionRecordAction(String record) {
        RecordReader reader = new RecordReader();
        ActionRecord  actionRecord = new ActionRecord();
        String actionType =  reader.getActionType(record);
        actionRecord.setAction(actionType);
        return actionRecord;
    }
}