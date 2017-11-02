package com.neiltimothygm.records;

/**
 * This class creates a ACTION record. It is a Subclass of Record class
 * @author Neil Timothy
 * @version 1.0
 */
public class ActionRecord extends Record {

    private String type;
    private String action;
    private String orderNum;
    private String source;
    private String comment;
    private String active;

    /**
     * Constructs a ACTION record with no specified state
     */
    public ActionRecord() {
    }

    /**
     * Constructs a ACTION record with specified type, action, orderNum, source, comment and active
     * @param type the type of ACTION record
     * @param action the action of the ACTION record
     * @param orderNum the orderNum of the ACTION record
     * @param source the source property of the ACTION record
     * @param comment the comment belonging to the ACTION record
     * @param active active state of the ACTION record
     */
    public ActionRecord(String type, String action, String orderNum, String source, String comment, String active) {
        this.type = type;
        this.action = action;
        this.orderNum = orderNum;
        this.source = source;
        this.comment = comment;
        this.active = active;
    }

    /**
     *
     * @return current type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type type to be set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return current Action
     */
    public String getAction() {
        return action;
    }

    /**
     *
     * @param action action to be set
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     *
     * @return current orderNum
     */
    public String getOrderNum() {
        return orderNum;
    }

    /**
     *
     * @param orderNum orderNum to be set
     */
    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    /**
     *
     * @return current source
     */
    public String getSource() {
        return source;
    }

    /**
     *
     * @param source source to be set
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     *
     * @return current comment
     */
    public String getComment() {
        return comment;
    }

    /**
     *
     * @param comment comment to be set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     *
     * @return current active
     */
    public String getActive() {
        return active;
    }

    /**
     *
     * @param active active to be set
     */
    public void setActive(String active) {
        this.active = active;
    }

    /**
     *
     * @return a ACTION record's state in String format
     */
    @Override
    public String toString() {
        return "ActionRecord{" +
                "type='" + type + '\'' +
                ", action='" + action + '\'' +
                ", orderNum='" + orderNum + '\'' +
                ", source='" + source + '\'' +
                ", comment='" + comment + '\'' +
                ", active='" + active + '\'' +
                '}';
    }
}