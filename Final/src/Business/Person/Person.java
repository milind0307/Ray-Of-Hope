/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Person;

import java.util.Date;

/**
 *
 * @author mandardeshmukh
 */
public class Person {
    
    int PersonId;
    String name;
    int PersonAge;
    String status;
    String imgDetails;
    String identificationMark;
    String gender;
    private String amt;
    private static int count = 1;
    private boolean isChallenged;
    Date registrationDate;
    String medicalStatus;
    private double bodytemp;
    private double BP;
    private double respirationRate;
    private boolean medicalHelp;
    private double pulseRate;
    private boolean financialHelp;
    
    
    
    public String getName() {
        return name;
    }
    
     public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }
    
     public void setGender(String gender) {
        this.gender = gender;
    }
    
     public String getIdentificationMark() {
        return identificationMark;
    }
    
     public void setIdentificationMark(String identificationMark) {
        this.identificationMark = identificationMark;
    }
     
     public int getPersonAge() {
        return PersonAge;
    }

    public void setPersonAge(int childAge) {
        this.PersonAge = childAge;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
     public String getImageDetails() {
        return imgDetails;
    }

    public void setImageDetails(String imageDetails) {
        this.imgDetails = imageDetails;
    }
    
    public double getBP() {
        return BP;
    }

    public void setBP(double BP) {
        this.BP = BP;
    }

    public double getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(double pulseRate) {
        this.pulseRate = pulseRate;
    }

    public double getRespirationRate() {
        return respirationRate;
    }

    public void setRespirationRate(double respirationRate) {
        this.respirationRate = respirationRate;
    }

    public double getBodytemp() {
        return bodytemp;
    }

    public void setBodytemp(double bodytemp) {
        this.bodytemp = bodytemp;
    }

    public String getMedicalStatus() {
        return medicalStatus;
    }

    public void setMedicalStatus(String medicalStatus) {
        this.medicalStatus = medicalStatus;
    }


    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }


    public int getPersonId() {
        return PersonId;
    }

    public void setChildId(int PersonId) {
        this.PersonId = PersonId;
    }

    
    public boolean isFinancialHelp() {
        return financialHelp;
    }

    public void setFinancialHelp(boolean financialHelp) {
        this.financialHelp = financialHelp;
    }

    public String getAmt() {
        return amt;
    }

    public void setAmt(String amt) {
        this.amt = amt;
    }

    public boolean isMedicalHelp() {
        return medicalHelp;
    }

    public void setMedicalHelp(boolean medicalHelp) {
        this.medicalHelp = medicalHelp;
    }

    public boolean isIsChallenged() {
        return isChallenged;
    }

    public void setIsChallenged(boolean isCjhallenged) {
        this.isChallenged = isChallenged;
    }

    @Override
    public String toString() {
        return String.valueOf(PersonId);
    }
}


