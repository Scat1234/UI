package com.neiltimothygm.recordcreator;

import com.neiltimothygm.records.Record;

import java.util.List;

/**
 *This interfaces creates abstraction for the recordListCreator method used within the ActionRecordCreator and SpecRecordCreator Classes
 * @Author Neil Timothy
 * @Version 1.0
 */
public interface RecordListCreator {

    /**
     * This recordListCreator method is responsible for creating list of Record Objects from List of Strings
     * @param recordData a List of Strings
     * @returns a List of Record objects
     */
    List<Record> recordListCreator(List<String> recordData);

}
