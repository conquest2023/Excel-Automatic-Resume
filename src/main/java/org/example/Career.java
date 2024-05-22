package org.example;

public class Career {
    String jobtitle;
    Integer workPeriod;
    String companyName;

    Integer employmentYears;

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public Integer getWorkPeriod() {
        return workPeriod;
    }

    public void setWorkPeriod(Integer workPeriod) {
        this.workPeriod = workPeriod;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getEmploymentYears() {
        return employmentYears;
    }

    public void setEmploymentYears(Integer employmentYears) {
        this.employmentYears = employmentYears;
    }

    public Career(String jobtitle, Integer workPeriod, String companyName, Integer employmentYears) {
        this.jobtitle = jobtitle;
        this.workPeriod = workPeriod;
        this.companyName = companyName;
        this.employmentYears = employmentYears;
    }
    public  Career(){
        this.jobtitle = jobtitle;
        this.workPeriod = workPeriod;
        this.companyName = companyName;
        this.employmentYears = employmentYears;

    }
}
