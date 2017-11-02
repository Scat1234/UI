package com.neiltimothygm.records;

/**
 * This class creates a SPEC records. Its is a Subclass of Record class
 * @author Neil Timothy
 * @version 1.0
 */
public class SpecRecord extends Record {

    private String spec;
    private String SpecId;
    private String startDate;
    private String endDate;
    private String cpl;
    private String eModel;
    private String source;
    private String opt;
    private String sol;

    /**
     * Constructs a SPEC record with no specified state
     */
    public SpecRecord() {
    }

    /**
     * Constructs a SPEC record with specified spec, startDate, endDate, specId, cpl, eModel,source,Opt and SOL
     * @param spec the spec of the spec record
     * @param startDate the startDate of the spec record
     * @param endDate the endDate of the spec record
     * @param specId the specId of the spec record
     * @param cpl the cpl of the spec record
     * @param eModel the eModel of the spec record
     * @param source the source of the spec record
     * @param opt the opt of the spec record
     * @param sol the SOL of the spec record
     */
    public SpecRecord(String spec, String startDate, String endDate, String specId, String cpl, String eModel, String source, String opt, String sol) {
        this.spec = spec;
        this.startDate = startDate;
        this.endDate = endDate;
        this.SpecId = specId;
        this.cpl = cpl;
        this.eModel = eModel;
        this.source = source;
        this.opt = opt;
        this.sol = sol;
    }

    /**
     *
     * @return current spec
     */
    public String getSpec() {
        return spec;
    }

    /**
     *
     * @param spec spec to be set
     */
    public void setSpec(String spec) {
        this.spec = spec;
    }

    /**
     *
     * @return current start Date
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     *
     * @param startDate start date to be set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     *
     * @return current end date
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     *
     * @param endDate end date to be set
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     *
     * @return current spec ID
     */
    public String getSpecId() {
        return SpecId;
    }

    /**
     *
     * @param specId to be set
     */
    public void setSpecId(String specId) {
        SpecId = specId;
    }

    /**
     *
     * @return current CPL
     */
    public String getCpl() {
        return cpl;
    }

    /**
     *
     * @param cpl cpl to be set
     */
    public void setCpl(String cpl) {
        this.cpl = cpl;
    }

    /**
     *
     * @return current eModel
     */
    public String getModel() {
        return eModel;
    }

    /**
     *
     * @param eModel eModel to be set
     */
    public void setModel(String eModel) {
        this.eModel = eModel;
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
    public void setSource(String source) { this.source = source;
    }

    /**
     *
     * @return current opt
     */
    public String getOpt() {
        return opt;
    }

    /**
     *
     * @param opt opt to be set
     */
    public void setOpt(String opt) {
        this.opt = opt;
    }

    /**
     *
     * @return current SOL
     */
    public String getSOL() {
        return sol;
    }

    /**
     *
     * @param SOL SOL to be set
     */
    public void setSOL(String SOL) {
        this.sol = SOL;
    }

    /**
     *
     * @return a SPEC record state in String format
     */
    @Override
    public String toString() {
        return "SpecRecord{" +
                "spec='" + spec + '\'' +
                ", SpecId='" + SpecId + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", Cpl='" + cpl + '\'' +
                ", eModel='" + eModel + '\'' +
                ", source='" + source + '\'' +
                ", Opt='" + opt + '\'' +
                ", SOL='" + sol + '\'' +
                '}';
    }
}