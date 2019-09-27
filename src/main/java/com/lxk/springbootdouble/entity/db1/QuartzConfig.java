package com.lxk.springbootdouble.entity.db1;

public class QuartzConfig {
    private Integer id;

    private String interiorApiSign;

    private String quartzName;

    private String quartzGroup;

    private String quartzClass;

    private String timespan;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInteriorApiSign() {
        return interiorApiSign;
    }

    public void setInteriorApiSign(String interiorApiSign) {
        this.interiorApiSign = interiorApiSign == null ? null : interiorApiSign.trim();
    }

    public String getQuartzName() {
        return quartzName;
    }

    public void setQuartzName(String quartzName) {
        this.quartzName = quartzName == null ? null : quartzName.trim();
    }

    public String getQuartzGroup() {
        return quartzGroup;
    }

    public void setQuartzGroup(String quartzGroup) {
        this.quartzGroup = quartzGroup == null ? null : quartzGroup.trim();
    }

    public String getQuartzClass() {
        return quartzClass;
    }

    public void setQuartzClass(String quartzClass) {
        this.quartzClass = quartzClass == null ? null : quartzClass.trim();
    }

    public String getTimespan() {
        return timespan;
    }

    public void setTimespan(String timespan) {
        this.timespan = timespan == null ? null : timespan.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}