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
    private int mId;

    @Nullable
    @ColumnInfo(name = "HardSkillName")
    private String hName;

    private String hProvelt;
    private double hValue;
    private String hCreationDate;

    public HardSkill(@Nullable String name, String provelt, double value, String creationDate) {
        hName = name;
        hProvelt = provelt;
        hValue = value;
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
        return hProvelt;
    }
    public void setprovelt(String provelt) {
        hProvelt = provelt;
    }
    public double getValue() {
        return hValue;
    }
    public void setScore(double value) {
        hValue  = value;
    }
    public String getCreationDate() {
        return hCreationDate;
    }
    public void setCreationDate(String creationDate) {
        hCreationDate = creationDate;
    }
}
