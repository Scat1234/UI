package com.neiltimothygm.recordslist;

import com.neiltimothygm.records.Record;
import java.util.List;

/**
 *This interfaces creates abstraction for the getRecordState method used within the ActionRecordsList and SpecRecordList classes
 * @Author Neil Timothy
 * @Version 1.0
 */
public interface GetRecordsState {
    List<String> getRecordState(Record s);
}
