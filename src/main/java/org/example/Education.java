package org.example;

public class Education {

   String graduationYear;
    String schoolName;
    String major;
    String graduationStatus;

    public String getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(String graduationYear) {
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

    public Education(String graduationStatus, String graduationYear, String schoolName, String major) {
        this.graduationYear = graduationYear;
        this.schoolName = schoolName;
        this.major = major;
        this.graduationStatus = graduationStatus;
    }
   public Education(){

    }

    @Override
    public String toString() {
        return "Education{" +
                "graduationYear=" + graduationYear +
                ", schoolName='" + schoolName + '\'' +
                ", major='" + major + '\'' +
                ", graduationStatus='" + graduationStatus + '\'' +
                '}';
    }
}
