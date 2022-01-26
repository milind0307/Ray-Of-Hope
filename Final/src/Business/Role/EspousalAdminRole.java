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
import userinterface.AdministrativeRole.AdminWorkAreaJPanel;

/**
 *
 * @author mandardeshmukh
 */
public class EspousalAdminRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, PersonDirectory Persondirectory, AdopterDirectory adopterdirectory,DonorDirectory donorDirectory) {
        return new AdminWorkAreaJPanel(userProcessContainer, account, organization, enterprise, business, Persondirectory, adopterdirectory,donorDirectory);
    }
    
    @Override
    public String toString(){
        return (Role.RoleType.EspousalAdmin.getValue());
    }
    
}
