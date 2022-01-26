/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organizations;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;


/**
 *
 * @author aniketmirajkar
 */
public abstract class Organization {
    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    private Type type;
    
     public enum Type{
        Admin("Admin Organization"), Medic("Medic Organization"), Lab("Lab Organization"),Pharmacy("Pharmacy Organization"),
        OrphanageAdmin("Orphanage Admin Organization"), PersonCare("Person Care Organization"), PersonRegistration("Person Registeration Organization"), FinanceOrganization ("Finance Organization"),
        EsposualAdmin("Espousal Admin Organization"), Espousal("Espousal Organization"), CriminalCheck("Criminal Check Organization"), FinanceCheck("Finance Check Organization"),Adopter("Adopter Organization")
        ,Donor("Donor Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory(); 
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
 
    @Override
    public String toString() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }    
}
