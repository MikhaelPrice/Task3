package com.A1.Task3.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoginsA1 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String application;
    private String appAccountName;
    private boolean isActive;
    private String jobTitle;
    private String department;

    public LoginsA1() {
    }

    public LoginsA1(String application, String appAccountName, boolean isActive, String jobTitle, String department) {
        this.application = application;
        this.appAccountName = appAccountName;
        this.isActive = isActive;
        this.jobTitle = jobTitle;
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getAppAccountName() {
        return appAccountName;
    }

    public void setAppAccountName(String appAccountName) {
        this.appAccountName = appAccountName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
