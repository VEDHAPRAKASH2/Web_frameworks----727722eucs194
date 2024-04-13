package com.day4.q2.model;

import jakarta.persistence.*;

@Entity
public class Job {
    @Id
    int jobId;
    int minSalary,maxSalary;
    String jobDescription,jobTitle;
    public int getJobId() {
        return jobId;
    }
    public void setJobId(int jobId) {
        this.jobId = jobId;
    }
    public int getMinSalary() {
        return minSalary;
    }
    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }
    public int getMaxSalary() {
        return maxSalary;
    }
    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }
    public String getJobDescription() {
        return jobDescription;
    }
    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public Job(int jobId, int minSalary, int maxSalary, String jobDescription, String jobTitle) {
        this.jobId = jobId;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.jobDescription = jobDescription;
        this.jobTitle = jobTitle;
    }
    public Job() {}
}
