/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Organizations.Organization;
import Business.Adopter.AdopterDirectory;
import Business.Donor.DonorDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;

import Business.Person.PersonDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Medic("Medic"),
        LabAssistant("Lab Assistant"),
        PersonCare("Person Care Examinator"),
        RayOfHope("Ray Of Hope Admin"),
        PersonRegistration("Person Registrar"), 
        Finance ("Accountant"),
        EspousalAdmin("Espousal Admin Organization"), 
        Espousal("Espousal Manager"), 
        Adopter("Adopter"),
        CriminalCheck("Criminal Check Org Employee"),
        FinanceCheck("Finance Check Org Employee"),
        Pharmacist("Pharmacist"),
        Donor("Sponsorer");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,EcoSystem business, PersonDirectory personDirectory, AdopterDirectory adopterDirectory,DonorDirectory donorDirectory);


    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}