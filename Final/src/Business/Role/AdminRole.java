/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;

import Business.Adopter.AdopterDirectory;
import Business.Donor.DonorDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organizations.Organization;
import Business.Person.PersonDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.AdministrativeRole.AdminWorkAreaJPanel;;

/**
 *
 * @author raunak
 */
public class AdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, PersonDirectory Persondirectory, AdopterDirectory adopterdirectory,DonorDirectory donorDirectory) {
       return new AdminWorkAreaJPanel(userProcessContainer,account,organization, enterprise, business,Persondirectory,adopterdirectory,donorDirectory);
       
    }   
}
