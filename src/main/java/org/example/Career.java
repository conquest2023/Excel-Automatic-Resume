package org.example;

public class Career {
     String duties;

    String workPeriod;
    String companyName;

     String employmentYears;

    public String getDuties() {
        return duties;
    }

    public void setDuties(String duties) {
        this.duties = duties;
    }

    public String getWorkPeriod() {
        return workPeriod;
    }

    public void setWorkPeriod(String workPeriod) {
        this.workPeriod = workPeriod;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmploymentYears() {
        return employmentYears;
    }

    public void setEmploymentYears(String employmentYears) {
        this.employmentYears = employmentYears;
    }

    public Career(String employmentYears,String companyName ,String jobtitle, String workPeriod) {
        this.duties = jobtitle;
        this.workPeriod = workPeriod;
        this.companyName = companyName;
        this.employmentYears = employmentYears;
    }
    Career(){

    }

    @Override
    public String toString() {
        return "Career{" +
                "jobtitle='" + duties + '\'' +
                ", workPeriod=" + workPeriod +
                ", companyName='" + companyName + '\'' +
                ", employmentYears=" + employmentYears +
                '}';
    }
}
