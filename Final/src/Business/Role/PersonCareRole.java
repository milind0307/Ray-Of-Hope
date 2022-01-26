/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Adopter.AdopterDirectory;
import Business.Donor.DonorDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organizations.Organization;
import Business.Person.PersonDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.RayOfHope.PersonCare.PersonCareWorkArea;

/**
 *
 * @author mandardeshmukh
 */
public class PersonCareRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, PersonDirectory personDirectory, AdopterDirectory adopterDirectory, DonorDirectory donorDirectory) {
        return new PersonCareWorkArea(userProcessContainer, account, organization, enterprise, business, personDirectory, adopterDirectory);
    }

    @Override
    public String toString() {
        return (Role.RoleType.PersonCare.getValue());
    }    
}
