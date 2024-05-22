package org.example;

public class Education {

    Integer graduationYear;
    String schoolName;
    String major;
    String graduationStatus;

    public Integer getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(Integer graduationYear) {
        this.graduationYear = graduationYear;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGraduationStatus() {
        return graduationStatus;
    }

    public void setGraduationStatus(String graduationStatus) {
        this.graduationStatus = graduationStatus;
    }

    public Education(Integer graduationYear, String schoolName, String major, String graduationStatus) {
        this.graduationYear = graduationYear;
        this.schoolName = schoolName;
        this.major = major;
        this.graduationStatus = graduationStatus;
    }
    public  Education(){
        this.graduationYear = graduationYear;
        this.schoolName = schoolName;
        this.major = major;
        this.graduationStatus = graduationStatus;

    }
}
