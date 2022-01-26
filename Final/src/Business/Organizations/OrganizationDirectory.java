/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organizations;

import static Business.Role.Role.RoleType.Medic;
import java.util.ArrayList;

/**
 *
 * @author aniketmirajkar
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }
    
    public Organization addNewOrganization(String name,Organization.Type type){
        
        Organization organization = null;
        
        if (type.getValue().equals(Organization.Type.Medic.getValue())){ 
           organization = new MedicOrganization(name);
           organizationList.add(organization);
           

        }
        else if (type.getValue().equals(Organization.Type.Lab.getValue())){
            organization = new LabOrganization(name);
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Organization.Type.Pharmacy.getValue())){
            organization = new PharmacyOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.PersonCare.getValue())){
            organization = new PersonCareOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.PersonRegistration.getValue())){
            organization = new PersonRegistrationOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.CriminalCheck.getValue())){
            organization = new VerificationOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.FinanceCheck.getValue())){
            organization = new FinanceOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Espousal.getValue())){
            organization = new EspousalOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Adopter.getValue())){
            organization = new AdopterOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Donor.getValue())){
            organization = new DonorOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.FinanceOrganization.getValue())){
            organization = new FinanceOrganization(name);
            organizationList.add(organization);
        }
        
        return organization;
    }
    
    public boolean isUnique(String name){
        for(Organization organization : organizationList){
            if(name.equalsIgnoreCase(organization.getName())){
                return false;
            }
        }
        return true;
    }
}
