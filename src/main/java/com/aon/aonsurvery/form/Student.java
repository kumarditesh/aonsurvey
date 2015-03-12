package com.aon.aonsurvery.form;

public class Student {

    private String name;
    private String maths;
    private String science;
    private String english;

    public Student() {
    }

    public Student(String name, String maths, String science, String english) {
        this.name = name;
        this.maths = maths;
        this.science = science;
        this.english = english;
    }

    //getters and setter..

    @Override
    public String toString() {
        return name + ": Maths " + maths + " Science " + science + " English " + english;
    }

    void setName(String stringCellValue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
