package com.course.greendao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table SETTING.
 */
public class SETTING {

    private Long id;
    private String settingkey;
    private String settingvalue;
    private java.util.Date changetime;

    public SETTING() {
    }

    public SETTING(Long id) {
        this.id = id;
    }

    public SETTING(Long id, String settingkey, String settingvalue, java.util.Date changetime) {
        this.id = id;
        this.settingkey = settingkey;
        this.settingvalue = settingvalue;
        this.changetime = changetime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSettingkey() {
        return settingkey;
    }

    public void setSettingkey(String settingkey) {
        this.settingkey = settingkey;
    }

    public String getSettingvalue() {
        return settingvalue;
    }

    public void setSettingvalue(String settingvalue) {
        this.settingvalue = settingvalue;
    }

    public java.util.Date getChangetime() {
        return changetime;
    }

    public void setChangetime(java.util.Date changetime) {
        this.changetime = changetime;
    }

}
