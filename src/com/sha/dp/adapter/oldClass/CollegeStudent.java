package com.sha.dp.adapter.oldClass;

public class CollegeStudent implements Student{

    private String studentName;
    private String standard;
    private String house;


    @Override
    public void setStudentName(String name) {
        this.studentName = name;
    }

    @Override
    public void setStandard(String standard) {
        this.standard = standard;
    }

    @Override
    public void setHouse(String house) {
        this.house = house;
    }

    @Override
    public String getStudentName() {
        return this.studentName;
    }

    @Override
    public String getStandard() {
        return this.standard;
    }

    @Override
    public String getHouse() {
        return this.house;
    }
}
