package com.example.agendiario;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity(tableName = "HardSkill")
public class HardSkill {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "HardskillId")
    private int hId;

    @Nullable
    @ColumnInfo(name = "HardSkillName")
    private String hName;

    private String hProvelt;
    private double hValue;
    private String mCreationDate;

    public HardSkill(@Nullable String name, String provelt, double value, String creationDate) {
        hName = name;
        hprovelt = provelt;
        hValue = Value;
        hCreationDate = creationDate;
    }
    public int getId() {
        return mId;
    }
    public void setId(int id) {
        mId = id;
    }
    public String getName() {
        return hName;
    }
    public void setName(String name) {
        hName = name;
    }
    public String getprovelt() {
        return mStyle;
    }
    public void setprovelt(String provelt) {
        hprovelt = provelt;
    }
    public double getValue() {
        return hValue;
    }
    public void setScore(double value) {
        hValue  = Value;
    }
    public String getCreationDate() {
        return mCreationDate;
    }
    public void setCreationDate(String creationDate) {
        mCreationDate = creationDate;
    }
}
